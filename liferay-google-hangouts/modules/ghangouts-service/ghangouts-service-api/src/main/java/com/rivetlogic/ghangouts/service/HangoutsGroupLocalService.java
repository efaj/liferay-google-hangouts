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

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.rivetlogic.ghangouts.model.HangoutsGroup;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for HangoutsGroup. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Rivet Logic
 * @see HangoutsGroupLocalServiceUtil
 * @see com.rivetlogic.ghangouts.service.base.HangoutsGroupLocalServiceBaseImpl
 * @see com.rivetlogic.ghangouts.service.impl.HangoutsGroupLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface HangoutsGroupLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HangoutsGroupLocalServiceUtil} to access the hangouts group local service. Add custom service methods to {@link com.rivetlogic.ghangouts.service.impl.HangoutsGroupLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	public DynamicQuery dynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Adds the hangouts group to the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public HangoutsGroup addHangoutsGroup(HangoutsGroup hangoutsGroup);

	public HangoutsGroup createHangoutsGroup(HangoutsGroup hangoutsGroup)
		throws PortalException, SystemException;

	/**
	* Creates a new hangouts group with the primary key. Does not add the hangouts group to the database.
	*
	* @param hangoutsGroupId the primary key for the new hangouts group
	* @return the new hangouts group
	*/
	public HangoutsGroup createHangoutsGroup(long hangoutsGroupId);

	/**
	* Deletes the hangouts group from the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public HangoutsGroup deleteHangoutsGroup(HangoutsGroup hangoutsGroup);

	/**
	* Deletes the hangouts group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroupId the primary key of the hangouts group
	* @return the hangouts group that was removed
	* @throws PortalException if a hangouts group with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public HangoutsGroup deleteHangoutsGroup(long hangoutsGroupId)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HangoutsGroup fetchHangoutsGroup(long hangoutsGroupId);

	public HangoutsGroup findByUserIdAndGroupName(java.lang.Long userId,
		java.lang.String groupName);

	/**
	* Returns the hangouts group with the primary key.
	*
	* @param hangoutsGroupId the primary key of the hangouts group
	* @return the hangouts group
	* @throws PortalException if a hangouts group with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public HangoutsGroup getHangoutsGroup(long hangoutsGroupId)
		throws PortalException;

	/**
	* Updates the hangouts group in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param hangoutsGroup the hangouts group
	* @return the hangouts group that was updated
	* @throws SystemException
	*/
	@Indexable(type = IndexableType.REINDEX)
	public HangoutsGroup updateHangoutsGroup(HangoutsGroup hangoutsGroup)
		throws SystemException;

	public int countByUserIdAndGroupName(java.lang.Long userId,
		java.lang.String groupName);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getHangoutsGroupByUserIdCount(java.lang.Long userId)
		throws SystemException;

	/**
	* Returns the number of hangouts groups.
	*
	* @return the number of hangouts groups
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getHangoutsGroupsCount();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public java.lang.String getOSGiServiceIdentifier();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HangoutsGroup> getHangoutsGroupByUserId(java.lang.Long userId,
		int start, int end, OrderByComparator<HangoutsGroup> obc)
		throws SystemException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<HangoutsGroup> getHangoutsGroups(int start, int end);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);
}