package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-17T18:10:12.023+0900")
public final class _Requirement extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.Requirement> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _Requirement __singleton = new _Requirement();

    /** the activityId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object> $activityId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Requirement.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "activityId", "ACTIVITY_ID", true, true);

    /** the damagePerJob */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Double, java.lang.Object> $damagePerJob = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.Requirement.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "damagePerJob", "DAMAGE_PER_JOB", true, true);

    /** the quantity */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object> $quantity = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Requirement.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "quantity", "QUANTITY", true, true);

    /** the recyde */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Boolean, java.lang.Object> $recyde = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Boolean, java.lang.Object>(com.binarysprite.evemat.entity.Requirement.class, java.lang.Boolean.class, org.seasar.doma.wrapper.BooleanWrapper.class, null, null, "recyde", "RECYDE", true, true);

    /** the requiredTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object> $requiredTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Requirement.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "requiredTypeId", "REQUIRED_TYPE_ID", true, true);

    /** the typeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object> $typeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Requirement.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "typeId", "TYPE_ID", true, true);

    private final com.binarysprite.evemat.entity.RequirementListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> __entityPropertyTypeMap;

    private _Requirement() {
        __listener = new com.binarysprite.evemat.entity.RequirementListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "Requirement";
        __catalogName = "";
        __schemaName = "";
        __tableName = "REQUIREMENT";
        __qualifiedTableName = "REQUIREMENT";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>>(6);
        __list.add($activityId);
        __map.put("activityId", $activityId);
        __list.add($damagePerJob);
        __map.put("damagePerJob", $damagePerJob);
        __list.add($quantity);
        __map.put("quantity", $quantity);
        __list.add($recyde);
        __map.put("recyde", $recyde);
        __list.add($requiredTypeId);
        __map.put("requiredTypeId", $requiredTypeId);
        __list.add($typeId);
        __map.put("typeId", $typeId);
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
    public void preInsert(com.binarysprite.evemat.entity.Requirement entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.Requirement entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.Requirement entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.Requirement entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.Requirement entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.Requirement entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Requirement, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Requirement, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.Requirement newEntity() {
        return new com.binarysprite.evemat.entity.Requirement();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.Requirement> getEntityClass() {
        return com.binarysprite.evemat.entity.Requirement.class;
    }

    @Override
    public com.binarysprite.evemat.entity.Requirement getOriginalStates(com.binarysprite.evemat.entity.Requirement __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.Requirement __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Requirement getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Requirement newInstance() {
        return new _Requirement();
    }

}
