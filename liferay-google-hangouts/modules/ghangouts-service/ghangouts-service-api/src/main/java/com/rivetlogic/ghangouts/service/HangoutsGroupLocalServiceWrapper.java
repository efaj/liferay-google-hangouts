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

package com.rivetlogic.ghangouts.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HangoutsGroupLocalService}.
 *
 * @author Rivet Logic
 * @see HangoutsGroupLocalService
 * @generated
 */
@ProviderType
public class HangoutsGroupLocalServiceWrapper
	implements HangoutsGroupLocalService,
		ServiceWrapper<HangoutsGroupLocalService> {
	public HangoutsGroupLocalServiceWrapper(
		HangoutsGroupLocalService hangoutsGroupLocalService) {
		_hangoutsGroupLocalService = hangoutsGroupLocalService;
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _hangoutsGroupLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _hangoutsGroupLocalService.dynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _hangoutsGroupLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hangoutsGroupLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hangoutsGroupLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the hangouts group to the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was added
	*/
	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup addHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup) {
		return _hangoutsGroupLocalService.addHangoutsGroup(hangoutsGroup);
	}

	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup createHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _hangoutsGroupLocalService.createHangoutsGroup(hangoutsGroup);
	}

	/**
	* Creates a new hangouts group with the primary key. Does not add the hangouts group to the database.
	*
	* @param hangoutsGroupId the primary key for the new hangouts group
	* @return the new hangouts group
	*/
	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup createHangoutsGroup(
		long hangoutsGroupId) {
		return _hangoutsGroupLocalService.createHangoutsGroup(hangoutsGroupId);
	}

	/**
	* Deletes the hangouts group from the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was removed
	*/
	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup deleteHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup) {
		return _hangoutsGroupLocalService.deleteHangoutsGroup(hangoutsGroup);
	}

	/**
	* Deletes the hangouts group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroupId the primary key of the hangouts group
	* @return the hangouts group that was removed
	* @throws PortalException if a hangouts group with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup deleteHangoutsGroup(
		long hangoutsGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hangoutsGroupLocalService.deleteHangoutsGroup(hangoutsGroupId);
	}

	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup fetchHangoutsGroup(
		long hangoutsGroupId) {
		return _hangoutsGroupLocalService.fetchHangoutsGroup(hangoutsGroupId);
	}

	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup findByUserIdAndGroupName(
		java.lang.Long userId, java.lang.String groupName) {
		return _hangoutsGroupLocalService.findByUserIdAndGroupName(userId,
			groupName);
	}

	/**
	* Returns the hangouts group with the primary key.
	*
	* @param hangoutsGroupId the primary key of the hangouts group
	* @return the hangouts group
	* @throws PortalException if a hangouts group with the primary key could not be found
	*/
	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup getHangoutsGroup(
		long hangoutsGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _hangoutsGroupLocalService.getHangoutsGroup(hangoutsGroupId);
	}

	/**
	* Updates the hangouts group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was updated
	* @throws SystemException
	*/
	@Override
	public com.rivetlogic.ghangouts.model.HangoutsGroup updateHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hangoutsGroupLocalService.updateHangoutsGroup(hangoutsGroup);
	}

	@Override
	public int countByUserIdAndGroupName(java.lang.Long userId,
		java.lang.String groupName) {
		return _hangoutsGroupLocalService.countByUserIdAndGroupName(userId,
			groupName);
	}

	@Override
	public int getHangoutsGroupByUserIdCount(java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hangoutsGroupLocalService.getHangoutsGroupByUserIdCount(userId);
	}

	/**
	* Returns the number of hangouts groups.
	*
	* @return the number of hangouts groups
	*/
	@Override
	public int getHangoutsGroupsCount() {
		return _hangoutsGroupLocalService.getHangoutsGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public java.lang.String getOSGiServiceIdentifier() {
		return _hangoutsGroupLocalService.getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _hangoutsGroupLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ghangouts.model.impl.HangoutsGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _hangoutsGroupLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ghangouts.model.impl.HangoutsGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _hangoutsGroupLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	@Override
	public java.util.List<com.rivetlogic.ghangouts.model.HangoutsGroup> getHangoutsGroupByUserId(
		java.lang.Long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rivetlogic.ghangouts.model.HangoutsGroup> obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _hangoutsGroupLocalService.getHangoutsGroupByUserId(userId,
			start, end, obc);
	}

	/**
	* Returns a range of all the hangouts groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.ghangouts.model.impl.HangoutsGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of hangouts groups
	* @param end the upper bound of the range of hangouts groups (not inclusive)
	* @return the range of hangouts groups
	*/
	@Override
	public java.util.List<com.rivetlogic.ghangouts.model.HangoutsGroup> getHangoutsGroups(
		int start, int end) {
		return _hangoutsGroupLocalService.getHangoutsGroups(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _hangoutsGroupLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _hangoutsGroupLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public HangoutsGroupLocalService getWrappedService() {
		return _hangoutsGroupLocalService;
	}

	@Override
	public void setWrappedService(
		HangoutsGroupLocalService hangoutsGroupLocalService) {
		_hangoutsGroupLocalService = hangoutsGroupLocalService;
	}

	private HangoutsGroupLocalService _hangoutsGroupLocalService;
}