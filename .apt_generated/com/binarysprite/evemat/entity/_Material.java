package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-17T18:10:11.991+0900")
public final class _Material extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.Material> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _Material __singleton = new _Material();

    /** the materialTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, java.lang.Integer, java.lang.Object> $materialTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Material.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "materialTypeId", "MATERIAL_TYPE_ID", true, true);

    /** the quantity */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, java.lang.Integer, java.lang.Object> $quantity = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Material.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "quantity", "QUANTITY", true, true);

    /** the typeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, java.lang.Integer, java.lang.Object> $typeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Material.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "typeId", "TYPE_ID", true, true);

    private final com.binarysprite.evemat.entity.MaterialListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> __entityPropertyTypeMap;

    private _Material() {
        __listener = new com.binarysprite.evemat.entity.MaterialListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "Material";
        __catalogName = "";
        __schemaName = "";
        __tableName = "MATERIAL";
        __qualifiedTableName = "MATERIAL";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>>(3);
        __list.add($materialTypeId);
        __map.put("materialTypeId", $materialTypeId);
        __list.add($quantity);
        __map.put("quantity", $quantity);
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
    public void preInsert(com.binarysprite.evemat.entity.Material entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.Material entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.Material entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.Material entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.Material entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.Material entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Material, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Material, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.Material newEntity() {
        return new com.binarysprite.evemat.entity.Material();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.Material> getEntityClass() {
        return com.binarysprite.evemat.entity.Material.class;
    }

    @Override
    public com.binarysprite.evemat.entity.Material getOriginalStates(com.binarysprite.evemat.entity.Material __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.Material __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Material getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Material newInstance() {
        return new _Material();
    }

}
