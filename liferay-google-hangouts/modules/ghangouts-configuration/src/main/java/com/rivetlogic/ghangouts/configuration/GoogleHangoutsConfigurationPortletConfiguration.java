package com.rivetlogic.ghangouts.configuration;

import com.liferay.portal.configuration.metatype.annotations.ExtendedObjectClassDefinition;
import aQute.bnd.annotation.metatype.Meta;

@ExtendedObjectClassDefinition(
		category = "other",
		scope=ExtendedObjectClassDefinition.Scope.PORTLET_INSTANCE
)
@Meta.OCD(
		id = "com.rivetlogic.ghangouts.configuration.GoogleHangoutsConfigurationPortletConfiguration"
)
public interface GoogleHangoutsConfigurationPortletConfiguration {
	@Meta.AD(
		deflt = "10",
		required = true
    )
	public int groupsPerPage();
	@Meta.AD(
		deflt = "10",
		required = true
	)
	public int usersPerPage();
}
