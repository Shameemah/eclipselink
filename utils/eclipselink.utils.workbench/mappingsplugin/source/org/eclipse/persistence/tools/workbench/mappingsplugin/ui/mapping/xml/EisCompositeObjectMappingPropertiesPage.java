/*******************************************************************************
 * Copyright (c) 1998, 2015 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *     Oracle - initial API and implementation from Oracle TopLink
******************************************************************************/
package org.eclipse.persistence.tools.workbench.mappingsplugin.ui.mapping.xml;

import org.eclipse.persistence.tools.workbench.framework.context.WorkbenchContext;
import org.eclipse.persistence.tools.workbench.mappingsmodel.mapping.xml.MWCompositeObjectMapping;


public final class EisCompositeObjectMappingPropertiesPage extends
        CompositeObjectMappingPropertiesPage {

    public EisCompositeObjectMappingPropertiesPage(WorkbenchContext context) {
        super(context);
    }

    protected AbstractXmlFieldPanel buildXmlFieldPanel() {
        return new AggregatableXmlFieldPanel(getSelectionHolder(), this.buildXmlFieldHolder(), this.getWorkbenchContextHolder(), MWCompositeObjectMapping.ELEMENT_TYPE_PROPERTY);
    }

}
