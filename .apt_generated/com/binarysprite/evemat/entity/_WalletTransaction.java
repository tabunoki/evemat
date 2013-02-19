package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.773+0900")
public final class _WalletTransaction extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.WalletTransaction> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _WalletTransaction __singleton = new _WalletTransaction();

    /** the accountKey */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Integer, java.lang.Object> $accountKey = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "accountKey", "ACCOUNT_KEY", true, true);

    /** the characterId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $characterId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "characterId", "CHARACTER_ID", true, true);

    /** the clientId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $clientId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "clientId", "CLIENT_ID", true, true);

    /** the clientName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object> $clientName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "clientName", "CLIENT_NAME", true, true);

    /** the journalTransactionId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $journalTransactionId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "journalTransactionId", "JOURNAL_TRANSACTION_ID", true, true);

    /** the price */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Double, java.lang.Object> $price = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "price", "PRICE", true, true);

    /** the quantity */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $quantity = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "quantity", "QUANTITY", true, true);

    /** the stationId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $stationId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "stationId", "STATION_ID", true, true);

    /** the stationName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object> $stationName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "stationName", "STATION_NAME", true, true);

    /** the transactionDateTime */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.sql.Timestamp, java.lang.Object> $transactionDateTime = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.sql.Timestamp, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "transactionDateTime", "TRANSACTION_DATE_TIME", true, true);

    /** the transactionFor */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object> $transactionFor = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "transactionFor", "TRANSACTION_FOR", true, true);

    /** the transactionId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $transactionId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "transactionId", "TRANSACTION_ID");

    /** the transactionType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object> $transactionType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "transactionType", "TRANSACTION_TYPE", true, true);

    /** the typeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object> $typeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "typeId", "TYPE_ID", true, true);

    /** the typeName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object> $typeName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletTransaction.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "typeName", "TYPE_NAME", true, true);

    private final com.binarysprite.evemat.entity.WalletTransactionListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> __entityPropertyTypeMap;

    private _WalletTransaction() {
        __listener = new com.binarysprite.evemat.entity.WalletTransactionListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "WalletTransaction";
        __catalogName = "";
        __schemaName = "";
        __tableName = "WALLET_TRANSACTION";
        __qualifiedTableName = "WALLET_TRANSACTION";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>>(15);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>>(15);
        __list.add($accountKey);
        __map.put("accountKey", $accountKey);
        __list.add($characterId);
        __map.put("characterId", $characterId);
        __list.add($clientId);
        __map.put("clientId", $clientId);
        __list.add($clientName);
        __map.put("clientName", $clientName);
        __list.add($journalTransactionId);
        __map.put("journalTransactionId", $journalTransactionId);
        __list.add($price);
        __map.put("price", $price);
        __list.add($quantity);
        __map.put("quantity", $quantity);
        __list.add($stationId);
        __map.put("stationId", $stationId);
        __list.add($stationName);
        __map.put("stationName", $stationName);
        __list.add($transactionDateTime);
        __map.put("transactionDateTime", $transactionDateTime);
        __list.add($transactionFor);
        __map.put("transactionFor", $transactionFor);
        __idList.add($transactionId);
        __list.add($transactionId);
        __map.put("transactionId", $transactionId);
        __list.add($transactionType);
        __map.put("transactionType", $transactionType);
        __list.add($typeId);
        __map.put("typeId", $typeId);
        __list.add($typeName);
        __map.put("typeName", $typeName);
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
    public void preInsert(com.binarysprite.evemat.entity.WalletTransaction entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.WalletTransaction entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.WalletTransaction entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.WalletTransaction entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.WalletTransaction entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.WalletTransaction entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletTransaction, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletTransaction, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.WalletTransaction newEntity() {
        return new com.binarysprite.evemat.entity.WalletTransaction();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.WalletTransaction> getEntityClass() {
        return com.binarysprite.evemat.entity.WalletTransaction.class;
    }

    @Override
    public com.binarysprite.evemat.entity.WalletTransaction getOriginalStates(com.binarysprite.evemat.entity.WalletTransaction __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.WalletTransaction __entity) {
    }

    /**
     * @return the singleton
     */
    public static _WalletTransaction getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _WalletTransaction newInstance() {
        return new _WalletTransaction();
    }

}
