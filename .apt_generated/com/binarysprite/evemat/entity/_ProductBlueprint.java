package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.793+0900")
public final class _ProductBlueprint extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.ProductBlueprint> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _ProductBlueprint __singleton = new _ProductBlueprint();

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the blueprintTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object> $blueprintTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductBlueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "blueprintTypeId", "BLUEPRINT_TYPE_ID", true, true);

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductBlueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "id", "ID", __idGenerator);

    /** the me */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object> $me = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductBlueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "me", "ME", true, true);

    /** the pe */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object> $pe = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductBlueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "pe", "PE", true, true);

    /** the productGroup */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object> $productGroup = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductBlueprint.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "productGroup", "PRODUCT_GROUP", true, true);

    private final com.binarysprite.evemat.entity.ProductBlueprintListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> __entityPropertyTypeMap;

    private _ProductBlueprint() {
        __listener = new com.binarysprite.evemat.entity.ProductBlueprintListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ProductBlueprint";
        __catalogName = "";
        __schemaName = "";
        __tableName = "PRODUCT_BLUEPRINT";
        __qualifiedTableName = "PRODUCT_BLUEPRINT";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>>(5);
        __list.add($blueprintTypeId);
        __map.put("blueprintTypeId", $blueprintTypeId);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __list.add($me);
        __map.put("me", $me);
        __list.add($pe);
        __map.put("pe", $pe);
        __list.add($productGroup);
        __map.put("productGroup", $productGroup);
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
    public void preInsert(com.binarysprite.evemat.entity.ProductBlueprint entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.ProductBlueprint entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.ProductBlueprint entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.ProductBlueprint entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.ProductBlueprint entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.ProductBlueprint entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductBlueprint, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductBlueprint, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.ProductBlueprint newEntity() {
        return new com.binarysprite.evemat.entity.ProductBlueprint();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.ProductBlueprint> getEntityClass() {
        return com.binarysprite.evemat.entity.ProductBlueprint.class;
    }

    @Override
    public com.binarysprite.evemat.entity.ProductBlueprint getOriginalStates(com.binarysprite.evemat.entity.ProductBlueprint __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.ProductBlueprint __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ProductBlueprint getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ProductBlueprint newInstance() {
        return new _ProductBlueprint();
    }

}
