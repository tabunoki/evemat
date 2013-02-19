package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.744+0900")
public final class _AccountCharacter extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.binarysprite.evemat.entity.AccountCharacter> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    private static final _AccountCharacter __singleton = new _AccountCharacter();

    /** the apiId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Integer, java.lang.Object> $apiId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "apiId", "API_ID", true, true);

    /** the apiVerificationCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.String, java.lang.Object> $apiVerificationCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "apiVerificationCode", "API_VERIFICATION_CODE", true, true);

    /** the characterId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Long, java.lang.Object> $characterId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "characterId", "CHARACTER_ID", true, true);

    /** the characterName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.String, java.lang.Object> $characterName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "characterName", "CHARACTER_NAME", true, true);

    /** the coporationName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.String, java.lang.Object> $coporationName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.String, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "coporationName", "COPORATION_NAME", true, true);

    /** the corporationId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Long, java.lang.Object> $corporationId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Long, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.Long.class, org.seasar.doma.wrapper.LongWrapper.class, null, null, "corporationId", "CORPORATION_ID", true, true);

    /** the skillIndustry */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Integer, java.lang.Object> $skillIndustry = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "skillIndustry", "SKILL_INDUSTRY", true, true);

    /** the skillProductionEfficiency */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Integer, java.lang.Object> $skillProductionEfficiency = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, java.lang.Integer, java.lang.Object>(com.binarysprite.evemat.entity.AccountCharacter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "skillProductionEfficiency", "SKILL_PRODUCTION_EFFICIENCY", true, true);

    private final com.binarysprite.evemat.entity.AccountCharacterListener __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> __entityPropertyTypeMap;

    private _AccountCharacter() {
        __listener = new com.binarysprite.evemat.entity.AccountCharacterListener();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __name = "AccountCharacter";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ACCOUNT_CHARACTER";
        __qualifiedTableName = "ACCOUNT_CHARACTER";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>>(8);
        __list.add($apiId);
        __map.put("apiId", $apiId);
        __list.add($apiVerificationCode);
        __map.put("apiVerificationCode", $apiVerificationCode);
        __list.add($characterId);
        __map.put("characterId", $characterId);
        __list.add($characterName);
        __map.put("characterName", $characterName);
        __list.add($coporationName);
        __map.put("coporationName", $coporationName);
        __list.add($corporationId);
        __map.put("corporationId", $corporationId);
        __list.add($skillIndustry);
        __map.put("skillIndustry", $skillIndustry);
        __list.add($skillProductionEfficiency);
        __map.put("skillProductionEfficiency", $skillProductionEfficiency);
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
    public void preInsert(com.binarysprite.evemat.entity.AccountCharacter entity, org.seasar.doma.jdbc.entity.PreInsertContext context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.binarysprite.evemat.entity.AccountCharacter entity, org.seasar.doma.jdbc.entity.PreUpdateContext context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.binarysprite.evemat.entity.AccountCharacter entity, org.seasar.doma.jdbc.entity.PreDeleteContext context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.binarysprite.evemat.entity.AccountCharacter entity, org.seasar.doma.jdbc.entity.PostInsertContext context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.binarysprite.evemat.entity.AccountCharacter entity, org.seasar.doma.jdbc.entity.PostUpdateContext context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.binarysprite.evemat.entity.AccountCharacter entity, org.seasar.doma.jdbc.entity.PostDeleteContext context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.binarysprite.evemat.entity.AccountCharacter, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.binarysprite.evemat.entity.AccountCharacter, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.binarysprite.evemat.entity.AccountCharacter newEntity() {
        return new com.binarysprite.evemat.entity.AccountCharacter();
    }

    @Override
    public Class<com.binarysprite.evemat.entity.AccountCharacter> getEntityClass() {
        return com.binarysprite.evemat.entity.AccountCharacter.class;
    }

    @Override
    public com.binarysprite.evemat.entity.AccountCharacter getOriginalStates(com.binarysprite.evemat.entity.AccountCharacter __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.binarysprite.evemat.entity.AccountCharacter __entity) {
    }

    /**
     * @return the singleton
     */
    public static _AccountCharacter getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _AccountCharacter newInstance() {
        return new _AccountCharacter();
    }

}
