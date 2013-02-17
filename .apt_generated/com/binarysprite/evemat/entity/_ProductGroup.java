package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-17T18:10:11.984+0900")
public final class _ProductGroup extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.ProductGroup> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _ProductGroup __singleton = new _ProductGroup();

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the characterId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.Long, java.lang.Object> $characterId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.ProductGroup.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "characterId", "CHARACTER_ID", true, true);

    /** the groupName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.String, java.lang.Object> $groupName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.ProductGroup.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "groupName", "GROUP_NAME", true, true);

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.Integer, java.lang.Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductGroup.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "id", "ID", __idGenerator);

    /** the productionTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.Integer, java.lang.Object> $productionTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductGroup.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "productionTime", "PRODUCTION_TIME", true, true);

    private final com.binarysprite.evemat.entity.ProductGroupListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> __entityPropertyTypeMap;

    private _ProductGroup() {
        __listener = new com.binarysprite.evemat.entity.ProductGroupListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ProductGroup";
        __catalogName = "";
        __schemaName = "";
        __tableName = "PRODUCT_GROUP";
        __qualifiedTableName = "PRODUCT_GROUP";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>>(4);
        __list.add($characterId);
        __map.put("characterId", $characterId);
        __list.add($groupName);
        __map.put("groupName", $groupName);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($productionTime);
        __map.put("productionTime", $productionTime);
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
    public void preInsert(com.binarysprite.evemat.entity.ProductGroup entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.ProductGroup entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.ProductGroup entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.ProductGroup entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.ProductGroup entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.ProductGroup entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductGroup, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductGroup, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.ProductGroup newEntity() {
        return new com.binarysprite.evemat.entity.ProductGroup();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.ProductGroup> getEntityClass() {
        return com.binarysprite.evemat.entity.ProductGroup.class;
    }

    @Override
    public com.binarysprite.evemat.entity.ProductGroup getOriginalStates(com.binarysprite.evemat.entity.ProductGroup __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.ProductGroup __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ProductGroup getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ProductGroup newInstance() {
        return new _ProductGroup();
    }

}
