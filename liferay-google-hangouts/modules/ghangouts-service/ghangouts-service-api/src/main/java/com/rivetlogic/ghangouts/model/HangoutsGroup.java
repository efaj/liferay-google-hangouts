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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the HangoutsGroup service. Represents a row in the &quot;rivetlogic_hangouts_HangoutsGroup&quot; database table, with each column mapped to a property of this class.
 *
 * @author Rivet Logic
 * @see HangoutsGroupModel
 * @see com.rivetlogic.ghangouts.model.impl.HangoutsGroupImpl
 * @see com.rivetlogic.ghangouts.model.impl.HangoutsGroupModelImpl
 * @generated
 */
@ImplementationClassName("com.rivetlogic.ghangouts.model.impl.HangoutsGroupImpl")
@ProviderType
public interface HangoutsGroup extends HangoutsGroupModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.rivetlogic.ghangouts.model.impl.HangoutsGroupImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<HangoutsGroup, Long> HANGOUTS_GROUP_ID_ACCESSOR =
		new Accessor<HangoutsGroup, Long>() {
			@Override
			public Long get(HangoutsGroup hangoutsGroup) {
				return hangoutsGroup.getHangoutsGroupId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<HangoutsGroup> getTypeClass() {
				return HangoutsGroup.class;
			}
		};

	public com.liferay.portal.kernel.json.JSONObject toJSON();
}