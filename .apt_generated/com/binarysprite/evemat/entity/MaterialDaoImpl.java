package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.913+0900")
public class MaterialDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.binarysprite.evemat.entity.MaterialDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    /** */
    public MaterialDaoImpl() {
        super(new com.binarysprite.evemat.DB());
    }

    /**
     * @param connection the connection
     */
    public MaterialDaoImpl(java.sql.Connection connection) {
        super(new com.binarysprite.evemat.DB(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public MaterialDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.binarysprite.evemat.DB(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected MaterialDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected MaterialDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected MaterialDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(com.binarysprite.evemat.entity.Material entity) {
        entering("com.binarysprite.evemat.entity.MaterialDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.Material> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.Material>(com.binarysprite.evemat.entity._Material.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.MaterialDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.MaterialDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.MaterialDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.binarysprite.evemat.entity.Material entity) {
        entering("com.binarysprite.evemat.entity.MaterialDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.Material> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.Material>(com.binarysprite.evemat.entity._Material.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.MaterialDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.MaterialDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.MaterialDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.binarysprite.evemat.entity.Material entity) {
        entering("com.binarysprite.evemat.entity.MaterialDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.Material> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.Material>(com.binarysprite.evemat.entity._Material.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.MaterialDaoImpl");
            __query.setCallerMethodName("update");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.MaterialDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.MaterialDaoImpl", "update", __e);
            throw __e;
        }
    }

}
