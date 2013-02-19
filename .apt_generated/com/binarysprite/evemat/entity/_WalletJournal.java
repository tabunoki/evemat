package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.858+0900")
public final class _WalletJournal extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.WalletJournal> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _WalletJournal __singleton = new _WalletJournal();

    /** the accountKey */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object> $accountKey = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "accountKey", "ACCOUNT_KEY", true, true);

    /** the amount */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Double, java.lang.Object> $amount = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "amount", "AMOUNT", true, true);

    /** the argId1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object> $argId1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "argId1", "ARG_ID_1", true, true);

    /** the argName1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object> $argName1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "argName1", "ARG_NAME_1", true, true);

    /** the balance */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Double, java.lang.Object> $balance = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Double, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Double.class, org.seasar.doma.wrapper.DoubleWrapper.class, null, null, "balance", "BALANCE", true, true);

    /** the characterId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Long, java.lang.Object> $characterId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "characterId", "CHARACTER_ID", true, true);

    /** the date */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.sql.Timestamp, java.lang.Object> $date = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.sql.Timestamp, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.sql.Timestamp.class, org.seasar.doma.wrapper.TimestampWrapper.class, null, null, "date", "DATE", true, true);

    /** the ownerId1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object> $ownerId1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "ownerId1", "OWNER_ID_1", true, true);

    /** the ownerId2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object> $ownerId2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "ownerId2", "OWNER_ID_2", true, true);

    /** the ownerName1 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object> $ownerName1 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "ownerName1", "OWNER_NAME_1", true, true);

    /** the ownerName2 */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object> $ownerName2 = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "ownerName2", "OWNER_NAME_2", true, true);

    /** the reason */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object> $reason = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "reason", "REASON", true, true);

    /** the refId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Long, java.lang.Object> $refId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "refId", "REF_ID");

    /** the refTypeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object> $refTypeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "refTypeId", "REF_TYPE_ID", true, true);

    /** the taxAmount */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object> $taxAmount = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "taxAmount", "TAX_AMOUNT", true, true);

    /** the taxReceiver */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object> $taxReceiver = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.WalletJournal.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "taxReceiver", "TAX_RECEIVER", true, true);

    private final com.binarysprite.evemat.entity.WalletJournalListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> __entityPropertyTypeMap;

    private _WalletJournal() {
        __listener = new com.binarysprite.evemat.entity.WalletJournalListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "WalletJournal";
        __catalogName = "";
        __schemaName = "";
        __tableName = "WALLET_JOURNAL";
        __qualifiedTableName = "WALLET_JOURNAL";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>>(16);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>>(16);
        __list.add($accountKey);
        __map.put("accountKey", $accountKey);
        __list.add($amount);
        __map.put("amount", $amount);
        __list.add($argId1);
        __map.put("argId1", $argId1);
        __list.add($argName1);
        __map.put("argName1", $argName1);
        __list.add($balance);
        __map.put("balance", $balance);
        __list.add($characterId);
        __map.put("characterId", $characterId);
        __list.add($date);
        __map.put("date", $date);
        __list.add($ownerId1);
        __map.put("ownerId1", $ownerId1);
        __list.add($ownerId2);
        __map.put("ownerId2", $ownerId2);
        __list.add($ownerName1);
        __map.put("ownerName1", $ownerName1);
        __list.add($ownerName2);
        __map.put("ownerName2", $ownerName2);
        __list.add($reason);
        __map.put("reason", $reason);
        __idList.add($refId);
        __list.add($refId);
        __map.put("refId", $refId);
        __list.add($refTypeId);
        __map.put("refTypeId", $refTypeId);
        __list.add($taxAmount);
        __map.put("taxAmount", $taxAmount);
        __list.add($taxReceiver);
        __map.put("taxReceiver", $taxReceiver);
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
    public void preInsert(com.binarysprite.evemat.entity.WalletJournal entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.WalletJournal entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.WalletJournal entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.WalletJournal entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.WalletJournal entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.WalletJournal entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.WalletJournal, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.WalletJournal, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.WalletJournal newEntity() {
        return new com.binarysprite.evemat.entity.WalletJournal();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.WalletJournal> getEntityClass() {
        return com.binarysprite.evemat.entity.WalletJournal.class;
    }

    @Override
    public com.binarysprite.evemat.entity.WalletJournal getOriginalStates(com.binarysprite.evemat.entity.WalletJournal __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.WalletJournal __entity) {
    }

    /**
     * @return the singleton
     */
    public static _WalletJournal getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _WalletJournal newInstance() {
        return new _WalletJournal();
    }

}
