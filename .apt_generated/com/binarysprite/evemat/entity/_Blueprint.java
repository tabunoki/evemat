package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-17T18:10:11.967+0900")
public final class _Blueprint extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.Blueprint> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _Blueprint __singleton = new _Blueprint();

    /** the blueprintTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $blueprintTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "blueprintTypeId", "BLUEPRINT_TYPE_ID", true, true);

    /** the materialModifier */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $materialModifier = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "materialModifier", "MATERIAL_MODIFIER", true, true);

    /** the maxProductionLimit */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $maxProductionLimit = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "maxProductionLimit", "MAX_PRODUCTION_LIMIT", true, true);

    /** the parentBlueprintTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $parentBlueprintTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "parentBlueprintTypeId", "PARENT_BLUEPRINT_TYPE_ID", true, true);

    /** the productTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $productTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "productTypeId", "PRODUCT_TYPE_ID", true, true);

    /** the productionTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $productionTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "productionTime", "PRODUCTION_TIME", true, true);

    /** the productivityModifier */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $productivityModifier = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "productivityModifier", "PRODUCTIVITY_MODIFIER", true, true);

    /** the researchCopyTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $researchCopyTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "researchCopyTime", "RESEARCH_COPY_TIME", true, true);

    /** the researchMaterialTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $researchMaterialTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "researchMaterialTime", "RESEARCH_MATERIAL_TIME", true, true);

    /** the researchProductivityTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $researchProductivityTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "researchProductivityTime", "RESEARCH_PRODUCTIVITY_TIME", true, true);

    /** the researchTechTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $researchTechTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "researchTechTime", "RESEARCH_TECH_TIME", true, true);

    /** the techLevel */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $techLevel = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "techLevel", "TECH_LEVEL", true, true);

    /** the wasteFactor */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object> $wasteFactor = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Blueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "wasteFactor", "WASTE_FACTOR", true, true);

    private final com.binarysprite.evemat.entity.BlueprintListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> __entityPropertyTypeMap;

    private _Blueprint() {
        __listener = new com.binarysprite.evemat.entity.BlueprintListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "Blueprint";
        __catalogName = "";
        __schemaName = "";
        __tableName = "BLUEPRINT";
        __qualifiedTableName = "BLUEPRINT";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>>(13);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>>(13);
        __list.add($blueprintTypeId);
        __map.put("blueprintTypeId", $blueprintTypeId);
        __list.add($materialModifier);
        __map.put("materialModifier", $materialModifier);
        __list.add($maxProductionLimit);
        __map.put("maxProductionLimit", $maxProductionLimit);
        __list.add($parentBlueprintTypeId);
        __map.put("parentBlueprintTypeId", $parentBlueprintTypeId);
        __list.add($productTypeId);
        __map.put("productTypeId", $productTypeId);
        __list.add($productionTime);
        __map.put("productionTime", $productionTime);
        __list.add($productivityModifier);
        __map.put("productivityModifier", $productivityModifier);
        __list.add($researchCopyTime);
        __map.put("researchCopyTime", $researchCopyTime);
        __list.add($researchMaterialTime);
        __map.put("researchMaterialTime", $researchMaterialTime);
        __list.add($researchProductivityTime);
        __map.put("researchProductivityTime", $researchProductivityTime);
        __list.add($researchTechTime);
        __map.put("researchTechTime", $researchTechTime);
        __list.add($techLevel);
        __map.put("techLevel", $techLevel);
        __list.add($wasteFactor);
        __map.put("wasteFactor", $wasteFactor);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(com.binarysprite.evemat.entity.Blueprint entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.Blueprint entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.Blueprint entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.Blueprint entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.Blueprint entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.Blueprint entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Blueprint, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Blueprint, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.Blueprint newEntity() {
        return new com.binarysprite.evemat.entity.Blueprint();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.Blueprint> getEntityClass() {
        return com.binarysprite.evemat.entity.Blueprint.class;
    }

    @Override
    public com.binarysprite.evemat.entity.Blueprint getOriginalStates(com.binarysprite.evemat.entity.Blueprint __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.Blueprint __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Blueprint getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Blueprint newInstance() {
        return new _Blueprint();
    }

}
