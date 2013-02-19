package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.889+0900")
public final class _Icon extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.Icon> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _Icon __singleton = new _Icon();

    /** the description */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, java.lang.String, java.lang.Object> $description = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.Icon.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "description", "DESCRIPTION", true, true);

    /** the iconFile */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, java.lang.String, java.lang.Object> $iconFile = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.Icon.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "iconFile", "ICON_FILE", true, true);

    /** the iconId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, java.lang.Integer, java.lang.Object> $iconId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Icon.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iconId", "ICON_ID");

    private final com.binarysprite.evemat.entity.IconListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> __entityPropertyTypeMap;

    private _Icon() {
        __listener = new com.binarysprite.evemat.entity.IconListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "Icon";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ICON";
        __qualifiedTableName = "ICON";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>>(3);
        __list.add($description);
        __map.put("description", $description);
        __list.add($iconFile);
        __map.put("iconFile", $iconFile);
        __idList.add($iconId);
        __list.add($iconId);
        __map.put("iconId", $iconId);
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
    public void preInsert(com.binarysprite.evemat.entity.Icon entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.Icon entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.Icon entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.Icon entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.Icon entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.Icon entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Icon, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Icon, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.Icon newEntity() {
        return new com.binarysprite.evemat.entity.Icon();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.Icon> getEntityClass() {
        return com.binarysprite.evemat.entity.Icon.class;
    }

    @Override
    public com.binarysprite.evemat.entity.Icon getOriginalStates(com.binarysprite.evemat.entity.Icon __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.Icon __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Icon getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Icon newInstance() {
        return new _Icon();
    }

}
