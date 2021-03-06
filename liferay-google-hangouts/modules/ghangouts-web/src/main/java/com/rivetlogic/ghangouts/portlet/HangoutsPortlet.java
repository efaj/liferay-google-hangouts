package com.rivetlogic.ghangouts.portlet;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.configuration.ConfigurationException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ListUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.rivetlogic.ghangouts.beans.ContactsBean;
import com.rivetlogic.ghangouts.beans.GroupsBean;
import com.rivetlogic.ghangouts.configuration.GoogleHangoutsConfigurationPortletConfiguration;
import com.rivetlogic.ghangouts.model.HangoutsGroup;
import com.rivetlogic.ghangouts.service.HangoutsGroupLocalServiceUtil;
import com.rivetlogic.ghangouts.util.Constants;
import com.rivetlogic.ghangouts.util.HangoutsUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.portlet.ReadOnlyException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.portlet.ValidatorException;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;

import aQute.bnd.annotation.metatype.Configurable;

/**
 * @author emmanuelabarca
 */
@Component(
	configurationPid = "com.rivetlogic.ghangouts.configuration.GoogleHangoutsConfigurationPortletConfiguration",
	immediate = true,
	property = {
		"javax.portlet.name=hangouts",
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ghangouts-web Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.init-param.help-template=/help.jsp",
		"javax.portlet.portlet-mode=text/html;view,help",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=administrator,guest,power-user,user",
		"javax.portlet.init-param.copy-request-parameters=false"
	},
	service = Portlet.class
)
public class HangoutsPortlet extends MVCPortlet {
    private static final Log LOG = LogFactoryUtil.getLog(HangoutsPortlet.class);
    
    @Override
    public void render(RenderRequest request, RenderResponse response) throws IOException, PortletException {
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        request.setAttribute(Constants.SIGNED_IN, themeDisplay.isSignedIn());
        
        PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
		try {
			GoogleHangoutsConfigurationPortletConfiguration configuration = portletDisplay.getPortletInstanceConfiguration(
                    GoogleHangoutsConfigurationPortletConfiguration.class);
			
			System.out.println("Users per page: " + configuration.usersPerPage());
			System.out.println("Groups per page: " + configuration.groupsPerPage());
		} catch (ConfigurationException ce) {
			LOG.error("Configuration exception ", ce);
		}
        super.render(request, response);
    }
    
    @Override
    public void serveResource(ResourceRequest request, ResourceResponse response)
            throws IOException, PortletException {
        String cmd = ParamUtil.getString(request, Constants.CMD);
        JSONObject jsonResponse = null;
        
        if (Constants.CMD_LIST_USERS.equalsIgnoreCase(cmd)) { 
            listUsers(request, response);
        } else if(Constants.CMD_LIST_GROUPS.equalsIgnoreCase(cmd)){
            listGroups(request, response);
        } else if(Constants.CMD_ADD_GROUP.equalsIgnoreCase(cmd)){
            jsonResponse = JSONFactoryUtil.createJSONObject();
            addGroup(request, response, jsonResponse);
        } else if(Constants.CMD_UPDATE_GROUP.equalsIgnoreCase(cmd)){
            jsonResponse = JSONFactoryUtil.createJSONObject();
            updateGroup(request, response, jsonResponse);
        } else if(Constants.CMD_UPDATE_GROUP_NAME.equalsIgnoreCase(cmd)){
            jsonResponse = JSONFactoryUtil.createJSONObject();
            updateGroupName(request, response, jsonResponse);
        } else if(Constants.CMD_GET_GROUP.equalsIgnoreCase(cmd)){
            jsonResponse = JSONFactoryUtil.createJSONObject();
            getGroupInfo(request, response, jsonResponse);
        } else if(Constants.CMD_REMOVE_GROUP.equalsIgnoreCase(cmd)){
            jsonResponse = JSONFactoryUtil.createJSONObject();
            removeGroup(request, response, jsonResponse);
        }
        
        if(jsonResponse != null){
            HangoutsUtil.returnJSONObject(response, jsonResponse);
        }
    }
    
    private void listUsers(PortletRequest request, PortletResponse response){
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        ContactsBean cb = new ContactsBean(themeDisplay.getUserId(), themeDisplay.getCompanyId());
        cb.setCurPage(ParamUtil.getInteger(request, Constants.CURRENT_PAGE, Constants.DEFAULT_ELEMENT_VALUE));
        cb.setDelta(ParamUtil.getInteger(request, Constants.DELTA, _configuration.groupsPerPage()));
        cb.setStart(cb.getCurPage() * cb.getDelta() - cb.getDelta());
        cb.setEnd(cb.getStart() + cb.getDelta());
        
        cb.setObc( (OrderByComparator<HangoutsGroup>) HangoutsUtil.getHangoutsComparator(ParamUtil.getString(request, Constants.ORDER_BY_COL, Constants.FIRST_NAME), 
                ParamUtil.getBoolean(request, Constants.IS_ASC, true)));
        cb.setSearch(ParamUtil.getString(request, Constants.SEARCH, null));
        
        cb.load();
        
        LOG.debug("Results: " + cb.toJSON());
        HangoutsUtil.returnJSONObject(response, cb.toJSON());
    }

    private void listGroups(PortletRequest request, PortletResponse response){
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        GroupsBean gb = new GroupsBean(themeDisplay.getUserId());
        gb.setCurPage(ParamUtil.getInteger(request, Constants.CURRENT_PAGE, Constants.DEFAULT_ELEMENT_VALUE));
        gb.setDelta(ParamUtil.getInteger(request, Constants.DELTA, _configuration.groupsPerPage()));
        gb.setStart(gb.getCurPage() * gb.getDelta() - gb.getDelta());
        gb.setEnd(gb.getStart() + gb.getDelta());
        
        gb.load();
        
        LOG.debug("Results: " + gb.toJSON());
        HangoutsUtil.returnJSONObject(response, gb.toJSON());
    }
    
    private void addGroup(PortletRequest request, PortletResponse response, JSONObject jsonResponse){
        try {   
            List<String> errors = new ArrayList<String>();
            HangoutsGroup sg = hangoutsGroupFromRequest(request);
            if(HangoutsPortletValidator.validateCreateGroup(sg, errors)){
                HangoutsGroupLocalServiceUtil.createHangoutsGroup(sg);
                jsonResponse.put(Constants.HANGOUTS_GROUP_ID, sg.getHangoutsGroupId());
                jsonResponse.put(Constants.CMD_SUCCESS, true);
            }else{
                jsonResponse.put(Constants.ERRORS, ListUtil.toString(errors, StringPool.BLANK, StringPool.COMMA));
                jsonResponse.put(Constants.CMD_SUCCESS, false);
            }
            
        } catch (JSONException e) {
            jsonResponse.put(Constants.CMD_SUCCESS, false);
            LOG.error("Wrong format in ids: ", e);
        }catch(Exception se){
            jsonResponse.put(Constants.CMD_SUCCESS, false);
            LOG.error(se);
        }
        
    }
    
    private void updateGroup(PortletRequest request, PortletResponse response, JSONObject jsonResponse){
        Long hangoutsGroupId = ParamUtil.getLong(request, Constants.HANGOUTS_GROUP_ID, Constants.UNDEFINED_ID);
        HangoutsGroup hangoutsGroup = null;
        if(Constants.UNDEFINED_ID != hangoutsGroupId){
            try {
                List<String> errors = new ArrayList<String>();
                hangoutsGroup = HangoutsGroupLocalServiceUtil.getHangoutsGroup(hangoutsGroupId);
                JSONArray obj = contactsFromRequest(request);
                hangoutsGroup.setGroupName(ParamUtil.getString(request, Constants.HANGOUTS_GROUP_NAME));
                hangoutsGroup.setHangoutsContacts(obj.toString());
                
                if(HangoutsPortletValidator.validateUpdateGroup(hangoutsGroup, errors)){
                    HangoutsGroupLocalServiceUtil.updateHangoutsGroup(hangoutsGroup);
                    jsonResponse.put(Constants.CMD_SUCCESS, true);
                }else{
                    jsonResponse.put(Constants.ERRORS, ListUtil.toString(errors, StringPool.BLANK, StringPool.COMMA));
                    jsonResponse.put(Constants.CMD_SUCCESS, false);
                }
                
            }catch (JSONException e) {
                jsonResponse.put(Constants.CMD_SUCCESS, false);
                LOG.error("Wrong format in ids: ", e);
            }catch (Exception e) {
                jsonResponse.put(Constants.CMD_SUCCESS, false);
                LOG.error(e);
            }
            
        }else{
            jsonResponse.put(Constants.CMD_SUCCESS, false);
        }
    }
    
    private void updateGroupName(PortletRequest request, PortletResponse response, JSONObject jsonResponse){
        Long hangoutsGroupId = ParamUtil.getLong(request, Constants.HANGOUTS_GROUP_ID, Constants.UNDEFINED_ID);
        HangoutsGroup hangoutsGroup = null;
        if(Constants.UNDEFINED_ID != hangoutsGroupId){
            try {
                List<String> errors = new ArrayList<String>();
                hangoutsGroup = HangoutsGroupLocalServiceUtil.getHangoutsGroup(hangoutsGroupId);
                hangoutsGroup.setGroupName(ParamUtil.getString(request, Constants.HANGOUTS_GROUP_ID));
                if(HangoutsPortletValidator.validateUpdateGroup(hangoutsGroup, errors)){
                    HangoutsGroupLocalServiceUtil.updateHangoutsGroup(hangoutsGroup);
                    jsonResponse.put(Constants.CMD_SUCCESS, true);
                }else{
                    jsonResponse.put(Constants.CMD_SUCCESS, false);
                }
                
            }catch (JSONException e) {
                jsonResponse.put(Constants.CMD_SUCCESS, false);
                LOG.error("Wrong format in ids: ", e);
            }catch (Exception e) {
                jsonResponse.put(Constants.CMD_SUCCESS, false);
                LOG.error(e);
            }
            
        }else{
            jsonResponse.put(Constants.CMD_SUCCESS, false);
        }
    }
    
    private void getGroupInfo(PortletRequest request, PortletResponse response, JSONObject jsonResponse){
        Long hangoutsGroupId = ParamUtil.getLong(request, Constants.HANGOUTS_GROUP_ID, Constants.UNDEFINED_ID);
        HangoutsGroup hangoutsGroup = null;
        if(Constants.UNDEFINED_ID != hangoutsGroupId){
            try {
                hangoutsGroup = HangoutsGroupLocalServiceUtil.getHangoutsGroup(hangoutsGroupId);
                jsonResponse.put(Constants.GROUP_INFO, hangoutsGroup.toJSON());
            } catch (Exception e) {
                jsonResponse.put(Constants.CMD_SUCCESS, false);
                LOG.error(e);
            }
        }else{
            jsonResponse.put(Constants.CMD_SUCCESS, false);
        }
    }
    
    private void removeGroup(PortletRequest request, PortletResponse response, JSONObject jsonResponse){
        Long hangoutsGroupId = ParamUtil.getLong(request, Constants.HANGOUTS_GROUP_ID, Constants.UNDEFINED_ID);
        
        if(Constants.UNDEFINED_ID != hangoutsGroupId){
            try {
                HangoutsGroupLocalServiceUtil.deleteHangoutsGroup(hangoutsGroupId);
                jsonResponse.put(Constants.CMD_SUCCESS, true);
            }catch (Exception e) {
                jsonResponse.put(Constants.CMD_SUCCESS, false);
                LOG.error(e);
            }
        }else{
            jsonResponse.put(Constants.CMD_SUCCESS, false);
        }
    }
    
    private HangoutsGroup hangoutsGroupFromRequest(PortletRequest request) throws JSONException{
        ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
        HangoutsGroup hangoutsGroup = HangoutsGroupLocalServiceUtil.createHangoutsGroup(0);
        hangoutsGroup.setGroupName(ParamUtil.getString(request, Constants.HANGOUTS_GROUP_NAME));
        hangoutsGroup.setUserId(themeDisplay.getUserId());
        JSONArray obj = contactsFromRequest(request);
        hangoutsGroup.setHangoutsContacts(obj.toString());
        return hangoutsGroup;
    }
    
    private JSONArray contactsFromRequest(PortletRequest request) throws JSONException{
        return JSONFactoryUtil.createJSONArray(ParamUtil.getString(request, Constants.IDS));
    }

    @Activate
	@Modified
	protected void activate(Map<String, Object> properties) {
		_configuration = Configurable.createConfigurable(
            GoogleHangoutsConfigurationPortletConfiguration.class, properties);
	}
    
    private volatile GoogleHangoutsConfigurationPortletConfiguration _configuration;
}
