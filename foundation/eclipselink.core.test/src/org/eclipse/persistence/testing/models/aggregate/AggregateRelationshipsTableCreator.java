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
 *     dminsky - initial API and implementation
 ******************************************************************************/  
package org.eclipse.persistence.testing.models.aggregate;

import org.eclipse.persistence.tools.schemaframework.*;

/**
 * This class was generated by the TopLink table creator generator.
 * It stores the meta-data (tables) that define the database schema.
 * @see org.eclipse.persistence.sessions.factories.TableCreatorClassGenerator
 */

public class AggregateRelationshipsTableCreator extends TableCreator {

public AggregateRelationshipsTableCreator() {
    setName("AggregateProblem");
    
    addTableDefinition(buildAGG_CHILDTable());
    addTableDefinition(buildAGG_PARENTTable());
    addTableDefinition(buildAGG_STEPCHILDTable());
    addTableDefinition(buildAGG_COUSINTable());
    addTableDefinition(buildAGG_NICKNAMETable());
    addTableDefinition(buildAGG_PARENT_RELATIVETable());
    addTableDefinition(buildAGG_RELATIVETable());
}

public TableDefinition buildAGG_CHILDTable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_CHILD");
    
    FieldDefinition fieldID = new FieldDefinition();
    fieldID.setName("ID");
    fieldID.setTypeName("NUMBER");
    fieldID.setSize(0);
    fieldID.setSubSize(0);
    fieldID.setIsPrimaryKey(true);
    fieldID.setIsIdentity(false);
    fieldID.setUnique(false);
    fieldID.setShouldAllowNull(false);
    table.addField(fieldID);
    
    FieldDefinition fieldPARENT_ID = new FieldDefinition();
    fieldPARENT_ID.setName("PARENT_ID");
    fieldPARENT_ID.setTypeName("NUMBER");
    fieldPARENT_ID.setSize(0);
    fieldPARENT_ID.setSubSize(0);
    fieldPARENT_ID.setIsPrimaryKey(false);
    fieldPARENT_ID.setIsIdentity(false);
    fieldPARENT_ID.setUnique(false);
    fieldPARENT_ID.setShouldAllowNull(true);
    table.addField(fieldPARENT_ID);
    
    ForeignKeyConstraint foreignKeyCHILD_PARENT = new ForeignKeyConstraint();
    foreignKeyCHILD_PARENT.setName("CHILD_PARENT");
    foreignKeyCHILD_PARENT.setTargetTable("AGG_PARENT");
    foreignKeyCHILD_PARENT.addSourceField("PARENT_ID");
    foreignKeyCHILD_PARENT.addTargetField("P_ID");
    table.addForeignKeyConstraint(foreignKeyCHILD_PARENT);
    
    return table;
}

public TableDefinition buildAGG_COUSINTable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_COUSIN");
    
    FieldDefinition fieldID = new FieldDefinition();
    fieldID.setName("ID");
    fieldID.setTypeName("NUMBER");
    fieldID.setSize(0);
    fieldID.setSubSize(0);
    fieldID.setIsPrimaryKey(true);
    fieldID.setIsIdentity(false);
    fieldID.setUnique(false);
    fieldID.setShouldAllowNull(false);
    table.addField(fieldID);
    
    FieldDefinition fieldNAME = new FieldDefinition();
    fieldNAME.setName("NAME");
    fieldNAME.setTypeName("VARCHAR2");
    fieldNAME.setSize(20);
    fieldNAME.setSubSize(0);
    fieldNAME.setIsPrimaryKey(false);
    fieldNAME.setIsIdentity(false);
    fieldNAME.setUnique(false);
    fieldNAME.setShouldAllowNull(true);
    table.addField(fieldNAME);
    
    return table;
}

public TableDefinition buildAGG_NICKNAMETable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_NICKNAME");
    
    FieldDefinition fieldNICKNAME = new FieldDefinition();
    fieldNICKNAME.setName("NICKNAME");
    fieldNICKNAME.setTypeName("VARCHAR2");
    fieldNICKNAME.setSize(20);
    fieldNICKNAME.setSubSize(0);
    fieldNICKNAME.setIsPrimaryKey(false);
    fieldNICKNAME.setIsIdentity(false);
    fieldNICKNAME.setUnique(false);
    fieldNICKNAME.setShouldAllowNull(false);
    table.addField(fieldNICKNAME);
    
    FieldDefinition fieldPARENT_ID = new FieldDefinition();
    fieldPARENT_ID.setName("PARENT_ID");
    fieldPARENT_ID.setTypeName("NUMBER");
    fieldPARENT_ID.setSize(0);
    fieldPARENT_ID.setSubSize(0);
    fieldPARENT_ID.setIsPrimaryKey(false);
    fieldPARENT_ID.setIsIdentity(false);
    fieldPARENT_ID.setUnique(false);
    fieldPARENT_ID.setShouldAllowNull(false);
    table.addField(fieldPARENT_ID);
    
    ForeignKeyConstraint foreignKeyNICKNAME_PARENT = new ForeignKeyConstraint();
    foreignKeyNICKNAME_PARENT.setName("NICKNAME_PARENT");
    foreignKeyNICKNAME_PARENT.setTargetTable("AGG_PARENT");
    foreignKeyNICKNAME_PARENT.addSourceField("PARENT_ID");
    foreignKeyNICKNAME_PARENT.addTargetField("P_ID");
    table.addForeignKeyConstraint(foreignKeyNICKNAME_PARENT);
    
    return table;
}

public TableDefinition buildAGG_PARENTTable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_PARENT");
    
    FieldDefinition fieldCOUSIN_ID = new FieldDefinition();
    fieldCOUSIN_ID.setName("COUSIN_ID");
    fieldCOUSIN_ID.setTypeName("NUMBER");
    fieldCOUSIN_ID.setSize(0);
    fieldCOUSIN_ID.setSubSize(0);
    fieldCOUSIN_ID.setIsPrimaryKey(false);
    fieldCOUSIN_ID.setIsIdentity(false);
    fieldCOUSIN_ID.setUnique(false);
    fieldCOUSIN_ID.setShouldAllowNull(true);
    table.addField(fieldCOUSIN_ID);
    
    FieldDefinition fieldP_ID = new FieldDefinition();
    fieldP_ID.setName("P_ID");
    fieldP_ID.setTypeName("NUMBER");
    fieldP_ID.setSize(0);
    fieldP_ID.setSubSize(0);
    fieldP_ID.setIsPrimaryKey(true);
    fieldP_ID.setIsIdentity(false);
    fieldP_ID.setUnique(false);
    fieldP_ID.setShouldAllowNull(false);
    table.addField(fieldP_ID);
    
    ForeignKeyConstraint foreignKeyPARENT_COUSIN = new ForeignKeyConstraint();
    foreignKeyPARENT_COUSIN.setName("PARENT_COUSIN");
    foreignKeyPARENT_COUSIN.setTargetTable("AGG_COUSIN");
    foreignKeyPARENT_COUSIN.addSourceField("COUSIN_ID");
    foreignKeyPARENT_COUSIN.addTargetField("ID");
    table.addForeignKeyConstraint(foreignKeyPARENT_COUSIN);
    
    return table;
}

public TableDefinition buildAGG_PARENT_RELATIVETable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_PARENT_RELATIVE");
    
    FieldDefinition fieldPARENT_ID = new FieldDefinition();
    fieldPARENT_ID.setName("PARENT_ID");
    fieldPARENT_ID.setTypeName("NUMBER");
    fieldPARENT_ID.setSize(0);
    fieldPARENT_ID.setSubSize(0);
    fieldPARENT_ID.setIsPrimaryKey(true);
    fieldPARENT_ID.setIsIdentity(false);
    fieldPARENT_ID.setUnique(false);
    fieldPARENT_ID.setShouldAllowNull(false);
    table.addField(fieldPARENT_ID);
    
    FieldDefinition fieldRELATIVE_ID = new FieldDefinition();
    fieldRELATIVE_ID.setName("RELATIVE_ID");
    fieldRELATIVE_ID.setTypeName("NUMBER");
    fieldRELATIVE_ID.setSize(0);
    fieldRELATIVE_ID.setSubSize(0);
    fieldRELATIVE_ID.setIsPrimaryKey(true);
    fieldRELATIVE_ID.setIsIdentity(false);
    fieldRELATIVE_ID.setUnique(false);
    fieldRELATIVE_ID.setShouldAllowNull(false);
    table.addField(fieldRELATIVE_ID);
    
    ForeignKeyConstraint foreignKeyPARENT_TO_RELATIVE = new ForeignKeyConstraint();
    foreignKeyPARENT_TO_RELATIVE.setName("PARENT_TO_RELATIVE");
    foreignKeyPARENT_TO_RELATIVE.setTargetTable("AGG_RELATIVE");
    foreignKeyPARENT_TO_RELATIVE.addSourceField("RELATIVE_ID");
    foreignKeyPARENT_TO_RELATIVE.addTargetField("REL_ID");
    table.addForeignKeyConstraint(foreignKeyPARENT_TO_RELATIVE);
    
    ForeignKeyConstraint foreignKeyRELATIVE_TO_PARENT = new ForeignKeyConstraint();
    foreignKeyRELATIVE_TO_PARENT.setName("RELATIVE_TO_PARENT");
    foreignKeyRELATIVE_TO_PARENT.setTargetTable("AGG_PARENT");
    foreignKeyRELATIVE_TO_PARENT.addSourceField("PARENT_ID");
    foreignKeyRELATIVE_TO_PARENT.addTargetField("P_ID");
    table.addForeignKeyConstraint(foreignKeyRELATIVE_TO_PARENT);
    
    return table;
}

public TableDefinition buildAGG_RELATIVETable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_RELATIVE");
    
    FieldDefinition fieldREL_ID = new FieldDefinition();
    fieldREL_ID.setName("REL_ID");
    fieldREL_ID.setTypeName("NUMBER");
    fieldREL_ID.setSize(0);
    fieldREL_ID.setSubSize(0);
    fieldREL_ID.setIsPrimaryKey(true);
    fieldREL_ID.setIsIdentity(false);
    fieldREL_ID.setUnique(false);
    fieldREL_ID.setShouldAllowNull(false);
    table.addField(fieldREL_ID);
    
    FieldDefinition fieldNAME = new FieldDefinition();
    fieldNAME.setName("NAME");
    fieldNAME.setTypeName("VARCHAR2");
    fieldNAME.setSize(20);
    fieldNAME.setSubSize(0);
    fieldNAME.setIsPrimaryKey(false);
    fieldNAME.setIsIdentity(false);
    fieldNAME.setUnique(false);
    fieldNAME.setShouldAllowNull(true);
    table.addField(fieldNAME);
    
    return table;
}

public TableDefinition buildAGG_STEPCHILDTable() {
    TableDefinition table = new TableDefinition();
    table.setName("AGG_STEPCHILD");
    
    FieldDefinition fieldID = new FieldDefinition();
    fieldID.setName("ID");
    fieldID.setTypeName("NUMBER");
    fieldID.setSize(0);
    fieldID.setSubSize(0);
    fieldID.setIsPrimaryKey(true);
    fieldID.setIsIdentity(false);
    fieldID.setUnique(false);
    fieldID.setShouldAllowNull(false);
    table.addField(fieldID);
    
    FieldDefinition fieldPARENT_ID = new FieldDefinition();
    fieldPARENT_ID.setName("PARENT_ID");
    fieldPARENT_ID.setTypeName("NUMBER");
    fieldPARENT_ID.setSize(0);
    fieldPARENT_ID.setSubSize(0);
    fieldPARENT_ID.setIsPrimaryKey(false);
    fieldPARENT_ID.setIsIdentity(false);
    fieldPARENT_ID.setUnique(false);
    fieldPARENT_ID.setShouldAllowNull(true);
    table.addField(fieldPARENT_ID);
    
    ForeignKeyConstraint foreignKeySTEPCHILD_PARENT = new ForeignKeyConstraint();
    foreignKeySTEPCHILD_PARENT.setName("STEPCHILD_PARENT");
    foreignKeySTEPCHILD_PARENT.setTargetTable("AGG_PARENT");
    foreignKeySTEPCHILD_PARENT.addSourceField("PARENT_ID");
    foreignKeySTEPCHILD_PARENT.addTargetField("P_ID");
    table.addForeignKeyConstraint(foreignKeySTEPCHILD_PARENT);
    
    return table;
}

}
