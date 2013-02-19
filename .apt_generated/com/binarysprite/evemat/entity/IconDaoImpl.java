package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.967+0900")
public class IconDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.binarysprite.evemat.entity.IconDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    /** */
    public IconDaoImpl() {
        super(new com.binarysprite.evemat.DB());
    }

    /**
     * @param connection the connection
     */
    public IconDaoImpl(java.sql.Connection connection) {
        super(new com.binarysprite.evemat.DB(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public IconDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.binarysprite.evemat.DB(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected IconDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected IconDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected IconDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(com.binarysprite.evemat.entity.Icon entity) {
        entering("com.binarysprite.evemat.entity.IconDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.Icon> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.Icon>(com.binarysprite.evemat.entity._Icon.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.IconDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.IconDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.IconDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.binarysprite.evemat.entity.Icon entity) {
        entering("com.binarysprite.evemat.entity.IconDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.Icon> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.Icon>(com.binarysprite.evemat.entity._Icon.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.IconDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.IconDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.IconDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public com.binarysprite.evemat.entity.Icon selectById(java.lang.Integer iconId) {
        entering("com.binarysprite.evemat.entity.IconDaoImpl", "selectById", iconId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/IconDao/selectById.sql");
            __query.addParameter("iconId", java.lang.Integer.class, iconId);
            __query.setCallerClassName("com.binarysprite.evemat.entity.IconDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.Icon> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.Icon>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.binarysprite.evemat.entity.Icon>(com.binarysprite.evemat.entity._Icon.getSingletonInternal()));
            com.binarysprite.evemat.entity.Icon __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.IconDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.IconDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.binarysprite.evemat.entity.Icon entity) {
        entering("com.binarysprite.evemat.entity.IconDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.Icon> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.Icon>(com.binarysprite.evemat.entity._Icon.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.IconDaoImpl");
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
            exiting("com.binarysprite.evemat.entity.IconDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.IconDaoImpl", "update", __e);
            throw __e;
        }
    }

}
