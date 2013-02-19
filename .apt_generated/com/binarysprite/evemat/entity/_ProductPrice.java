package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.831+0900")
public final class _ProductPrice extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.ProductPrice> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _ProductPrice __singleton = new _ProductPrice();

    /** the allAverage */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $allAverage = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "allAverage", "ALL_AVERAGE", true, true);

    /** the allMax */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $allMax = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "allMax", "ALL_MAX", true, true);

    /** the allMedian */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $allMedian = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "allMedian", "ALL_MEDIAN", true, true);

    /** the allMin */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $allMin = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "allMin", "ALL_MIN", true, true);

    /** the allStandardDeviation */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $allStandardDeviation = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "allStandardDeviation", "ALL_STANDARD_DEVIATION", true, true);

    /** the allVolume */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Long, java.lang.Object> $allVolume = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "allVolume", "ALL_VOLUME", true, true);

    /** the buyAverage */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $buyAverage = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "buyAverage", "BUY_AVERAGE", true, true);

    /** the buyMax */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $buyMax = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "buyMax", "BUY_MAX", true, true);

    /** the buyMedian */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $buyMedian = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "buyMedian", "BUY_MEDIAN", true, true);

    /** the buyMin */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $buyMin = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "buyMin", "BUY_MIN", true, true);

    /** the buyStandardDeviation */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $buyStandardDeviation = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "buyStandardDeviation", "BUY_STANDARD_DEVIATION", true, true);

    /** the buyVolume */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Long, java.lang.Object> $buyVolume = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "buyVolume", "BUY_VOLUME", true, true);

    /** the sellAverage */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $sellAverage = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "sellAverage", "SELL_AVERAGE", true, true);

    /** the sellMax */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $sellMax = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "sellMax", "SELL_MAX", true, true);

    /** the sellMedian */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $sellMedian = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "sellMedian", "SELL_MEDIAN", true, true);

    /** the sellMin */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $sellMin = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "sellMin", "SELL_MIN", true, true);

    /** the sellStandardDeviation */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object> $sellStandardDeviation = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "sellStandardDeviation", "SELL_STANDARD_DEVIATION", true, true);

    /** the sellVolume */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Long, java.lang.Object> $sellVolume = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "sellVolume", "SELL_VOLUME", true, true);

    /** the typeId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Integer, java.lang.Object> $typeId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "typeId", "TYPE_ID");

    /** the updateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.sql.Timestamp, java.lang.Object> $updateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, java.sql.Timestamp, java.lang.Object>(com.binarysprite.evemat.entity.ProductPrice.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "updateTime", "UPDATE_TIME", true, true);

    private final com.binarysprite.evemat.entity.ProductPriceListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> __entityPropertyTypeMap;

    private _ProductPrice() {
        __listener = new com.binarysprite.evemat.entity.ProductPriceListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "ProductPrice";
        __catalogName = "";
        __schemaName = "";
        __tableName = "PRODUCT_PRICE";
        __qualifiedTableName = "PRODUCT_PRICE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>>(20);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>>(20);
        __list.add($allAverage);
        __map.put("allAverage", $allAverage);
        __list.add($allMax);
        __map.put("allMax", $allMax);
        __list.add($allMedian);
        __map.put("allMedian", $allMedian);
        __list.add($allMin);
        __map.put("allMin", $allMin);
        __list.add($allStandardDeviation);
        __map.put("allStandardDeviation", $allStandardDeviation);
        __list.add($allVolume);
        __map.put("allVolume", $allVolume);
        __list.add($buyAverage);
        __map.put("buyAverage", $buyAverage);
        __list.add($buyMax);
        __map.put("buyMax", $buyMax);
        __list.add($buyMedian);
        __map.put("buyMedian", $buyMedian);
        __list.add($buyMin);
        __map.put("buyMin", $buyMin);
        __list.add($buyStandardDeviation);
        __map.put("buyStandardDeviation", $buyStandardDeviation);
        __list.add($buyVolume);
        __map.put("buyVolume", $buyVolume);
        __list.add($sellAverage);
        __map.put("sellAverage", $sellAverage);
        __list.add($sellMax);
        __map.put("sellMax", $sellMax);
        __list.add($sellMedian);
        __map.put("sellMedian", $sellMedian);
        __list.add($sellMin);
        __map.put("sellMin", $sellMin);
        __list.add($sellStandardDeviation);
        __map.put("sellStandardDeviation", $sellStandardDeviation);
        __list.add($sellVolume);
        __map.put("sellVolume", $sellVolume);
        __idList.add($typeId);
        __list.add($typeId);
        __map.put("typeId", $typeId);
        __list.add($updateTime);
        __map.put("updateTime", $updateTime);
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
    public void preInsert(com.binarysprite.evemat.entity.ProductPrice entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.ProductPrice entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.ProductPrice entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.ProductPrice entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.ProductPrice entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.ProductPrice entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.ProductPrice, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.ProductPrice, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.ProductPrice newEntity() {
        return new com.binarysprite.evemat.entity.ProductPrice();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.ProductPrice> getEntityClass() {
        return com.binarysprite.evemat.entity.ProductPrice.class;
    }

    @Override
    public com.binarysprite.evemat.entity.ProductPrice getOriginalStates(com.binarysprite.evemat.entity.ProductPrice __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.ProductPrice __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ProductPrice getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ProductPrice newInstance() {
        return new _ProductPrice();
    }

}
