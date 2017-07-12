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

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for HangoutsGroup. This utility wraps
 * {@link com.rivetlogic.ghangouts.service.impl.HangoutsGroupLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Rivet Logic
 * @see HangoutsGroupLocalService
 * @see com.rivetlogic.ghangouts.service.base.HangoutsGroupLocalServiceBaseImpl
 * @see com.rivetlogic.ghangouts.service.impl.HangoutsGroupLocalServiceImpl
 * @generated
 */
@ProviderType
public class HangoutsGroupLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.rivetlogic.ghangouts.service.impl.HangoutsGroupLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Adds the hangouts group to the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was added
	*/
	public static com.rivetlogic.ghangouts.model.HangoutsGroup addHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup) {
		return getService().addHangoutsGroup(hangoutsGroup);
	}

	public static com.rivetlogic.ghangouts.model.HangoutsGroup createHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().createHangoutsGroup(hangoutsGroup);
	}

	/**
	* Creates a new hangouts group with the primary key. Does not add the hangouts group to the database.
	*
	* @param hangoutsGroupId the primary key for the new hangouts group
	* @return the new hangouts group
	*/
	public static com.rivetlogic.ghangouts.model.HangoutsGroup createHangoutsGroup(
		long hangoutsGroupId) {
		return getService().createHangoutsGroup(hangoutsGroupId);
	}

	/**
	* Deletes the hangouts group from the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was removed
	*/
	public static com.rivetlogic.ghangouts.model.HangoutsGroup deleteHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup) {
		return getService().deleteHangoutsGroup(hangoutsGroup);
	}

	/**
	* Deletes the hangouts group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroupId the primary key of the hangouts group
	* @return the hangouts group that was removed
	* @throws PortalException if a hangouts group with the primary key could not be found
	*/
	public static com.rivetlogic.ghangouts.model.HangoutsGroup deleteHangoutsGroup(
		long hangoutsGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteHangoutsGroup(hangoutsGroupId);
	}

	public static com.rivetlogic.ghangouts.model.HangoutsGroup fetchHangoutsGroup(
		long hangoutsGroupId) {
		return getService().fetchHangoutsGroup(hangoutsGroupId);
	}

	public static com.rivetlogic.ghangouts.model.HangoutsGroup findByUserIdAndGroupName(
		java.lang.Long userId, java.lang.String groupName) {
		return getService().findByUserIdAndGroupName(userId, groupName);
	}

	/**
	* Returns the hangouts group with the primary key.
	*
	* @param hangoutsGroupId the primary key of the hangouts group
	* @return the hangouts group
	* @throws PortalException if a hangouts group with the primary key could not be found
	*/
	public static com.rivetlogic.ghangouts.model.HangoutsGroup getHangoutsGroup(
		long hangoutsGroupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getHangoutsGroup(hangoutsGroupId);
	}

	/**
	* Updates the hangouts group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was updated
	* @throws SystemException
	*/
	public static com.rivetlogic.ghangouts.model.HangoutsGroup updateHangoutsGroup(
		com.rivetlogic.ghangouts.model.HangoutsGroup hangoutsGroup)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateHangoutsGroup(hangoutsGroup);
	}

	public static int countByUserIdAndGroupName(java.lang.Long userId,
		java.lang.String groupName) {
		return getService().countByUserIdAndGroupName(userId, groupName);
	}

	public static int getHangoutsGroupByUserIdCount(java.lang.Long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHangoutsGroupByUserIdCount(userId);
	}

	/**
	* Returns the number of hangouts groups.
	*
	* @return the number of hangouts groups
	*/
	public static int getHangoutsGroupsCount() {
		return getService().getHangoutsGroupsCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.rivetlogic.ghangouts.model.HangoutsGroup> getHangoutsGroupByUserId(
		java.lang.Long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.rivetlogic.ghangouts.model.HangoutsGroup> obc)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getHangoutsGroupByUserId(userId, start, end, obc);
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
	public static java.util.List<com.rivetlogic.ghangouts.model.HangoutsGroup> getHangoutsGroups(
		int start, int end) {
		return getService().getHangoutsGroups(start, end);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static HangoutsGroupLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HangoutsGroupLocalService, HangoutsGroupLocalService> _serviceTracker =
		ServiceTrackerFactory.open(HangoutsGroupLocalService.class);
}