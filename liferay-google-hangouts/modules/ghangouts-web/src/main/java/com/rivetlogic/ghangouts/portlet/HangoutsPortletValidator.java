/**
 * Copyright (C) 2005-2014 Rivet Logic Corporation.
 * 
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; version 3 of the License.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */

package com.rivetlogic.ghangouts.portlet;

import com.rivetlogic.ghangouts.model.HangoutsGroup;
import com.rivetlogic.ghangouts.service.HangoutsGroupLocalServiceUtil;
import com.rivetlogic.ghangouts.util.Constants;
import com.liferay.portal.kernel.util.StringPool;

import java.util.List;

/**
 * @author christopherjimenez
 *
 */
public class HangoutsPortletValidator {

	private static int MINIMUM_COUNT = 1;
	private static int INVALID_COUNT = -1;
	
	private static void validateCommonFields(HangoutsGroup hangoutsGroup, List<String> errors){
		
		if(StringPool.BLANK.equals(hangoutsGroup.getGroupName())){
			errors.add(Constants.EMPTY_GROUP_NAME);
		}
		if(StringPool.BLANK.equals(hangoutsGroup.getHangoutsContacts())){
			errors.add(Constants.EMPTY_CONTACTS);
		}
	}
	
	public static boolean validateCreateGroup(HangoutsGroup hangoutsGroup, List<String> errors){
		validateCommonFields(hangoutsGroup, errors);
		int count = HangoutsGroupLocalServiceUtil.countByUserIdAndGroupName(hangoutsGroup.getUserId(), hangoutsGroup.getGroupName());
		
		if(count == MINIMUM_COUNT){
			errors.add(Constants.NOT_UNIQUE_GROUP);
		} else if(count == INVALID_COUNT){
			errors.add(Constants.UNEXPECTED_ERROR);
		}
		
		return errors.isEmpty();
	}
	
	public static boolean validateUpdateGroup(HangoutsGroup hangoutsGroup, List<String> errors){
		validateCommonFields(hangoutsGroup, errors);
		int count = HangoutsGroupLocalServiceUtil.countByUserIdAndGroupName(hangoutsGroup.getUserId(), hangoutsGroup.getGroupName());
		
		if(count == MINIMUM_COUNT){
		    HangoutsGroup groupFound = HangoutsGroupLocalServiceUtil.findByUserIdAndGroupName(hangoutsGroup.getUserId(), hangoutsGroup.getGroupName());
			if(groupFound.getHangoutsGroupId() != hangoutsGroup.getHangoutsGroupId()){
				errors.add(Constants.NOT_UNIQUE_GROUP);
			}
		}else if(count == INVALID_COUNT){
			errors.add(Constants.UNEXPECTED_ERROR);
		}
		return errors.isEmpty();
	}
}
