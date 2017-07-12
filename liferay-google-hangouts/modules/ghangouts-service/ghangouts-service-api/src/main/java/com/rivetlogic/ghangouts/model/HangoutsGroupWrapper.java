/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.rivetlogic.ghangouts.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link HangoutsGroup}.
 * </p>
 *
 * @author Rivet Logic
 * @see HangoutsGroup
 * @generated
 */
@ProviderType
public class HangoutsGroupWrapper implements HangoutsGroup,
	ModelWrapper<HangoutsGroup> {
	public HangoutsGroupWrapper(HangoutsGroup hangoutsGroup) {
		_hangoutsGroup = hangoutsGroup;
	}

	@Override
	public Class<?> getModelClass() {
		return HangoutsGroup.class;
	}

	@Override
	public String getModelClassName() {
		return HangoutsGroup.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("hangoutsGroupId", getHangoutsGroupId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("groupName", getGroupName());
		attributes.put("hangoutsContacts", getHangoutsContacts());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long hangoutsGroupId = (Long)attributes.get("hangoutsGroupId");

		if (hangoutsGroupId != null) {
			setHangoutsGroupId(hangoutsGroupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String groupName = (String)attributes.get("groupName");

		if (groupName != null) {
			setGroupName(groupName);
		}

		String hangoutsContacts = (String)attributes.get("hangoutsContacts");

		if (hangoutsContacts != null) {
			setHangoutsContacts(hangoutsContacts);
		}
	}

	@Override
	public HangoutsGroup toEscapedModel() {
		return new HangoutsGroupWrapper(_hangoutsGroup.toEscapedModel());
	}

	@Override
	public HangoutsGroup toUnescapedModel() {
		return new HangoutsGroupWrapper(_hangoutsGroup.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _hangoutsGroup.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _hangoutsGroup.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _hangoutsGroup.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _hangoutsGroup.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject toJSON() {
		return _hangoutsGroup.toJSON();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<HangoutsGroup> toCacheModel() {
		return _hangoutsGroup.toCacheModel();
	}

	@Override
	public int compareTo(HangoutsGroup hangoutsGroup) {
		return _hangoutsGroup.compareTo(hangoutsGroup);
	}

	@Override
	public int hashCode() {
		return _hangoutsGroup.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _hangoutsGroup.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new HangoutsGroupWrapper((HangoutsGroup)_hangoutsGroup.clone());
	}

	/**
	* Returns the group name of this hangouts group.
	*
	* @return the group name of this hangouts group
	*/
	@Override
	public java.lang.String getGroupName() {
		return _hangoutsGroup.getGroupName();
	}

	/**
	* Returns the hangouts contacts of this hangouts group.
	*
	* @return the hangouts contacts of this hangouts group
	*/
	@Override
	public java.lang.String getHangoutsContacts() {
		return _hangoutsGroup.getHangoutsContacts();
	}

	/**
	* Returns the user name of this hangouts group.
	*
	* @return the user name of this hangouts group
	*/
	@Override
	public java.lang.String getUserName() {
		return _hangoutsGroup.getUserName();
	}

	/**
	* Returns the user uuid of this hangouts group.
	*
	* @return the user uuid of this hangouts group
	*/
	@Override
	public java.lang.String getUserUuid() {
		return _hangoutsGroup.getUserUuid();
	}

	@Override
	public java.lang.String toString() {
		return _hangoutsGroup.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _hangoutsGroup.toXmlString();
	}

	/**
	* Returns the create date of this hangouts group.
	*
	* @return the create date of this hangouts group
	*/
	@Override
	public Date getCreateDate() {
		return _hangoutsGroup.getCreateDate();
	}

	/**
	* Returns the modified date of this hangouts group.
	*
	* @return the modified date of this hangouts group
	*/
	@Override
	public Date getModifiedDate() {
		return _hangoutsGroup.getModifiedDate();
	}

	/**
	* Returns the hangouts group ID of this hangouts group.
	*
	* @return the hangouts group ID of this hangouts group
	*/
	@Override
	public long getHangoutsGroupId() {
		return _hangoutsGroup.getHangoutsGroupId();
	}

	/**
	* Returns the primary key of this hangouts group.
	*
	* @return the primary key of this hangouts group
	*/
	@Override
	public long getPrimaryKey() {
		return _hangoutsGroup.getPrimaryKey();
	}

	/**
	* Returns the user ID of this hangouts group.
	*
	* @return the user ID of this hangouts group
	*/
	@Override
	public long getUserId() {
		return _hangoutsGroup.getUserId();
	}

	@Override
	public void persist() {
		_hangoutsGroup.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_hangoutsGroup.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this hangouts group.
	*
	* @param createDate the create date of this hangouts group
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_hangoutsGroup.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_hangoutsGroup.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_hangoutsGroup.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_hangoutsGroup.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group name of this hangouts group.
	*
	* @param groupName the group name of this hangouts group
	*/
	@Override
	public void setGroupName(java.lang.String groupName) {
		_hangoutsGroup.setGroupName(groupName);
	}

	/**
	* Sets the hangouts contacts of this hangouts group.
	*
	* @param hangoutsContacts the hangouts contacts of this hangouts group
	*/
	@Override
	public void setHangoutsContacts(java.lang.String hangoutsContacts) {
		_hangoutsGroup.setHangoutsContacts(hangoutsContacts);
	}

	/**
	* Sets the hangouts group ID of this hangouts group.
	*
	* @param hangoutsGroupId the hangouts group ID of this hangouts group
	*/
	@Override
	public void setHangoutsGroupId(long hangoutsGroupId) {
		_hangoutsGroup.setHangoutsGroupId(hangoutsGroupId);
	}

	/**
	* Sets the modified date of this hangouts group.
	*
	* @param modifiedDate the modified date of this hangouts group
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_hangoutsGroup.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_hangoutsGroup.setNew(n);
	}

	/**
	* Sets the primary key of this hangouts group.
	*
	* @param primaryKey the primary key of this hangouts group
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_hangoutsGroup.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_hangoutsGroup.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this hangouts group.
	*
	* @param userId the user ID of this hangouts group
	*/
	@Override
	public void setUserId(long userId) {
		_hangoutsGroup.setUserId(userId);
	}

	/**
	* Sets the user name of this hangouts group.
	*
	* @param userName the user name of this hangouts group
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_hangoutsGroup.setUserName(userName);
	}

	/**
	* Sets the user uuid of this hangouts group.
	*
	* @param userUuid the user uuid of this hangouts group
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_hangoutsGroup.setUserUuid(userUuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HangoutsGroupWrapper)) {
			return false;
		}

		HangoutsGroupWrapper hangoutsGroupWrapper = (HangoutsGroupWrapper)obj;

		if (Objects.equals(_hangoutsGroup, hangoutsGroupWrapper._hangoutsGroup)) {
			return true;
		}

		return false;
	}

	@Override
	public HangoutsGroup getWrappedModel() {
		return _hangoutsGroup;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _hangoutsGroup.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _hangoutsGroup.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_hangoutsGroup.resetOriginalValues();
	}

	private final HangoutsGroup _hangoutsGroup;
}