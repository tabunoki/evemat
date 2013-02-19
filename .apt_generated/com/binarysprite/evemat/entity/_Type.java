package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.809+0900")
public final class _Type extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.Type> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _Type __singleton = new _Type();

    /** the basePrice */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object> $basePrice = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "basePrice", "BASE_PRICE", true, true);

    /** the capacity */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object> $capacity = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "capacity", "CAPACITY", true, true);

    /** the chanceOfDuplicating */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object> $chanceOfDuplicating = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "chanceOfDuplicating", "CHANCE_OF_DUPLICATING", true, true);

    /** the description */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.String, java.lang.Object> $description = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "description", "DESCRIPTION", true, true);

    /** the groupId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object> $groupId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "groupId", "GROUP_ID", true, true);

    /** the iconId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object> $iconId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iconId", "ICON_ID", true, true);

    /** the marketGroupId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object> $marketGroupId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "marketGroupId", "MARKET_GROUP_ID", true, true);

    /** the mass */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object> $mass = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "mass", "MASS", true, true);

    /** the portionSize */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object> $portionSize = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "portionSize", "PORTION_SIZE", true, true);

    /** the published */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Boolean, java.lang.Object> $published = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Boolean, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Boolean.class, org.seasar.doma.wrapper.BooleanWrapper.class, null, null, "published", "PUBLISHED", true, true);

    /** the raceId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object> $raceId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "raceId", "RACE_ID", true, true);

    /** the typeId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object> $typeId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "typeId", "TYPE_ID");

    /** the typeName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.String, java.lang.Object> $typeName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "typeName", "TYPE_NAME", true, true);

    /** the volume */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object> $volume = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.Type.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "volume", "VOLUME", true, true);

    private final com.binarysprite.evemat.entity.TypeListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> __entityPropertyTypeMap;

    private _Type() {
        __listener = new com.binarysprite.evemat.entity.TypeListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "Type";
        __catalogName = "";
        __schemaName = "";
        __tableName = "TYPE";
        __qualifiedTableName = "TYPE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>>(14);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>>(14);
        __list.add($basePrice);
        __map.put("basePrice", $basePrice);
        __list.add($capacity);
        __map.put("capacity", $capacity);
        __list.add($chanceOfDuplicating);
        __map.put("chanceOfDuplicating", $chanceOfDuplicating);
        __list.add($description);
        __map.put("description", $description);
        __list.add($groupId);
        __map.put("groupId", $groupId);
        __list.add($iconId);
        __map.put("iconId", $iconId);
        __list.add($marketGroupId);
        __map.put("marketGroupId", $marketGroupId);
        __list.add($mass);
        __map.put("mass", $mass);
        __list.add($portionSize);
        __map.put("portionSize", $portionSize);
        __list.add($published);
        __map.put("published", $published);
        __list.add($raceId);
        __map.put("raceId", $raceId);
        __idList.add($typeId);
        __list.add($typeId);
        __map.put("typeId", $typeId);
        __list.add($typeName);
        __map.put("typeName", $typeName);
        __list.add($volume);
        __map.put("volume", $volume);
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
    public void preInsert(com.binarysprite.evemat.entity.Type entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.Type entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.Type entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.Type entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.Type entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.Type entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.Type, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.Type, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.Type newEntity() {
        return new com.binarysprite.evemat.entity.Type();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.Type> getEntityClass() {
        return com.binarysprite.evemat.entity.Type.class;
    }

    @Override
    public com.binarysprite.evemat.entity.Type getOriginalStates(com.binarysprite.evemat.entity.Type __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.Type __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Type getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Type newInstance() {
        return new _Type();
    }

}
