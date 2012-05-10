/*******************************************************************************
 * Copyright (c) 1998, 2012 Oracle and/or its affiliates. All rights reserved.
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
package org.eclipse.persistence.testing.models.mapping;

import java.util.*;

/**
 * TopLink generated Project class.
 * <b>WARNING</b>: This code was generated by an automated tool.
 * Any changes will be lost when the code is re-generated
 */
public class BiDirectionInserOrderTestProject extends org.eclipse.persistence.sessions.Project {

    /**
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    public BiDirectionInserOrderTestProject() {
        applyPROJECT();
        applyLOGIN();
        buildBabyDescriptor();
        buildBabyMonitorDescriptor();
        buildCribDescriptor();
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void applyLOGIN() {
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void applyPROJECT() {
        setName("insertOrder");
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void buildBabyDescriptor() {
        org.eclipse.persistence.descriptors.RelationalDescriptor descriptor = new org.eclipse.persistence.descriptors.RelationalDescriptor();

        // SECTION: DESCRIPTOR
        descriptor.setJavaClass(org.eclipse.persistence.testing.models.mapping.Baby.class);
        Vector vector = new Vector();
        vector.addElement("BABY");
        descriptor.setTableNames(vector);
        descriptor.addPrimaryKeyFieldName("BABY.ID");

        // SECTION: PROPERTIES
        descriptor.setIdentityMapClass(org.eclipse.persistence.internal.identitymaps.FullIdentityMap.class);
        descriptor.setSequenceNumberName("SEQ_BABY");
        descriptor.setSequenceNumberFieldName("ID");
        descriptor.setExistenceChecking("Check cache");
        descriptor.setIdentityMapSize(100);

        // SECTION: COPY POLICY
        descriptor.createCopyPolicy("constructor");

        // SECTION: INSTANTIATION POLICY
        descriptor.createInstantiationPolicy("constructor");

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping.setAttributeName("id");
        directtofieldmapping.setIsReadOnly(false);
        directtofieldmapping.setGetMethodName("getId");
        directtofieldmapping.setSetMethodName("setId");
        directtofieldmapping.setFieldName("BABY.ID");
        descriptor.addMapping(directtofieldmapping);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping1 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping1.setAttributeName("name");
        directtofieldmapping1.setIsReadOnly(false);
        directtofieldmapping1.setGetMethodName("getName");
        directtofieldmapping1.setSetMethodName("setName");
        directtofieldmapping1.setFieldName("BABY.NAME");
        descriptor.addMapping(directtofieldmapping1);

        // SECTION: ONETOONEMAPPING
        org.eclipse.persistence.mappings.OneToOneMapping onetoonemapping = new org.eclipse.persistence.mappings.OneToOneMapping();
        onetoonemapping.setAttributeName("babyMonitor");
        onetoonemapping.setIsReadOnly(false);
        onetoonemapping.setUsesIndirection(false);
        onetoonemapping.setGetMethodName("getBabyMonitor");
        onetoonemapping.setSetMethodName("setBabyMonitor");
        onetoonemapping.setReferenceClass(org.eclipse.persistence.testing.models.mapping.BabyMonitor.class);
        onetoonemapping.setIsPrivateOwned(false);
        onetoonemapping.addForeignKeyFieldName("BABY.MONITOR_ID", "BABY_MONIOTR.ID");
        descriptor.addMapping(onetoonemapping);

        // SECTION: ONETOONEMAPPING
        org.eclipse.persistence.mappings.OneToOneMapping onetoonemapping1 = new org.eclipse.persistence.mappings.OneToOneMapping();
        onetoonemapping1.setAttributeName("crib");
        onetoonemapping1.setIsReadOnly(false);
        onetoonemapping1.setUsesIndirection(false);
        onetoonemapping1.setGetMethodName("getCrib");
        onetoonemapping1.setSetMethodName("setCrib");
        onetoonemapping1.setReferenceClass(org.eclipse.persistence.testing.models.mapping.Crib.class);
        onetoonemapping1.setIsPrivateOwned(false);
        onetoonemapping1.addForeignKeyFieldName("BABY.CRIB_ID", "CRIB.ID");
        descriptor.addMapping(onetoonemapping1);

        org.eclipse.persistence.testing.models.mapping.Baby.addToDescriptor(descriptor);
        addDescriptor(descriptor);
    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void buildBabyMonitorDescriptor() {
        org.eclipse.persistence.descriptors.RelationalDescriptor descriptor = new org.eclipse.persistence.descriptors.RelationalDescriptor();

        // SECTION: DESCRIPTOR
        descriptor.setJavaClass(org.eclipse.persistence.testing.models.mapping.BabyMonitor.class);
        Vector vector = new Vector();
        vector.addElement("BABY_MONIOTR");
        descriptor.setTableNames(vector);
        descriptor.addPrimaryKeyFieldName("BABY_MONIOTR.ID");

        // SECTION: PROPERTIES
        descriptor.setIdentityMapClass(org.eclipse.persistence.internal.identitymaps.FullIdentityMap.class);
        descriptor.setSequenceNumberName("SEQ_MONITOR");
        descriptor.setSequenceNumberFieldName("ID");
        descriptor.setExistenceChecking("Check cache");
        descriptor.setIdentityMapSize(100);

        // SECTION: COPY POLICY
        descriptor.createCopyPolicy("constructor");

        // SECTION: INSTANTIATION POLICY
        descriptor.createInstantiationPolicy("constructor");

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping.setAttributeName("brandName");
        directtofieldmapping.setIsReadOnly(false);
        directtofieldmapping.setGetMethodName("getBrandName");
        directtofieldmapping.setSetMethodName("setBrandName");
        directtofieldmapping.setFieldName("BABY_MONIOTR.BRAND_NAME");
        descriptor.addMapping(directtofieldmapping);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping1 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping1.setAttributeName("id");
        directtofieldmapping1.setIsReadOnly(false);
        directtofieldmapping1.setGetMethodName("getId");
        directtofieldmapping1.setSetMethodName("setId");
        directtofieldmapping1.setFieldName("BABY_MONIOTR.ID");
        descriptor.addMapping(directtofieldmapping1);

        // SECTION: ONETOONEMAPPING
        org.eclipse.persistence.mappings.OneToOneMapping onetoonemapping1 = new org.eclipse.persistence.mappings.OneToOneMapping();
        onetoonemapping1.setAttributeName("crib");
        onetoonemapping1.setIsReadOnly(false);
        onetoonemapping1.setUsesIndirection(false);
        onetoonemapping1.setGetMethodName("getCrib");
        onetoonemapping1.setSetMethodName("setCrib");
        onetoonemapping1.setReferenceClass(org.eclipse.persistence.testing.models.mapping.Crib.class);
        onetoonemapping1.setIsPrivateOwned(false);
        onetoonemapping1.addForeignKeyFieldName("BABY_MONIOTR.CRIB_ID", "CRIB.ID");
        descriptor.addMapping(onetoonemapping1);
        // SECTION: ONETOONEMAPPING
        org.eclipse.persistence.mappings.OneToOneMapping onetoonemapping = new org.eclipse.persistence.mappings.OneToOneMapping();
        onetoonemapping.setAttributeName("baby");
        onetoonemapping.setIsReadOnly(false);
        onetoonemapping.setUsesIndirection(false);
        onetoonemapping.setGetMethodName("getBaby");
        onetoonemapping.setSetMethodName("setBaby");
        onetoonemapping.setReferenceClass(org.eclipse.persistence.testing.models.mapping.Baby.class);
        onetoonemapping.setIsPrivateOwned(false);
        onetoonemapping.addForeignKeyFieldName("BABY_MONIOTR.BABY_ID", "BABY.ID");
        descriptor.addMapping(onetoonemapping);
        addDescriptor(descriptor);

    }

    /**
     * TopLink generated method.
     * <b>WARNING</b>: This code was generated by an automated tool.
     * Any changes will be lost when the code is re-generated
     */
    protected void buildCribDescriptor() {
        org.eclipse.persistence.descriptors.RelationalDescriptor descriptor = new org.eclipse.persistence.descriptors.RelationalDescriptor();

        // SECTION: DESCRIPTOR
        descriptor.setJavaClass(org.eclipse.persistence.testing.models.mapping.Crib.class);
        Vector vector = new Vector();
        vector.addElement("CRIB");
        descriptor.setTableNames(vector);
        descriptor.addPrimaryKeyFieldName("CRIB.ID");

        // SECTION: PROPERTIES
        descriptor.setIdentityMapClass(org.eclipse.persistence.internal.identitymaps.FullIdentityMap.class);
        descriptor.setSequenceNumberName("SEQ_CRIB");
        descriptor.setSequenceNumberFieldName("ID");
        descriptor.setExistenceChecking("Check cache");
        descriptor.setIdentityMapSize(100);

        // SECTION: COPY POLICY
        descriptor.createCopyPolicy("constructor");

        // SECTION: INSTANTIATION POLICY
        descriptor.createInstantiationPolicy("constructor");

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping.setAttributeName("color");
        directtofieldmapping.setIsReadOnly(false);
        directtofieldmapping.setGetMethodName("getColor");
        directtofieldmapping.setSetMethodName("setColor");
        directtofieldmapping.setFieldName("CRIB.COLOR");
        descriptor.addMapping(directtofieldmapping);

        // SECTION: DIRECTTOFIELDMAPPING
        org.eclipse.persistence.mappings.DirectToFieldMapping directtofieldmapping1 = new org.eclipse.persistence.mappings.DirectToFieldMapping();
        directtofieldmapping1.setAttributeName("id");
        directtofieldmapping1.setIsReadOnly(false);
        directtofieldmapping1.setGetMethodName("getId");
        directtofieldmapping1.setSetMethodName("setId");
        directtofieldmapping1.setFieldName("CRIB.ID");
        descriptor.addMapping(directtofieldmapping1);

        // SECTION: ONETOONEMAPPING
        org.eclipse.persistence.mappings.OneToOneMapping onetoonemapping1 = new org.eclipse.persistence.mappings.OneToOneMapping();
        onetoonemapping1.setAttributeName("babyMonitor");
        onetoonemapping1.setIsReadOnly(false);
        onetoonemapping1.setUsesIndirection(false);
        onetoonemapping1.setGetMethodName("getBabyMonitor");
        onetoonemapping1.setSetMethodName("setBabyMonitor");
        onetoonemapping1.setReferenceClass(org.eclipse.persistence.testing.models.mapping.BabyMonitor.class);
        onetoonemapping1.setIsPrivateOwned(false);
        onetoonemapping1.addForeignKeyFieldName("CRIB.MONITOR_ID", "BABY_MONIOTR.ID");
        descriptor.addMapping(onetoonemapping1);

        // SECTION: ONETOONEMAPPING
        org.eclipse.persistence.mappings.OneToOneMapping onetoonemapping = new org.eclipse.persistence.mappings.OneToOneMapping();
        onetoonemapping.setAttributeName("baby");
        onetoonemapping.setIsReadOnly(false);
        onetoonemapping.setUsesIndirection(false);
        onetoonemapping.setGetMethodName("getBaby");
        onetoonemapping.setSetMethodName("setBaby");
        onetoonemapping.setReferenceClass(org.eclipse.persistence.testing.models.mapping.Baby.class);
        onetoonemapping.setIsPrivateOwned(false);
        onetoonemapping.addForeignKeyFieldName("CRIB.BABY_ID", "BABY.ID");
        descriptor.addMapping(onetoonemapping);

        org.eclipse.persistence.testing.models.mapping.Crib.addToDescriptor(descriptor);
        addDescriptor(descriptor);
    }
}
