package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:06.025+0900")
public class ProductGroupDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.binarysprite.evemat.entity.ProductGroupDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    /** */
    public ProductGroupDaoImpl() {
        super(new com.binarysprite.evemat.DB());
    }

    /**
     * @param connection the connection
     */
    public ProductGroupDaoImpl(java.sql.Connection connection) {
        super(new com.binarysprite.evemat.DB(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public ProductGroupDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.binarysprite.evemat.DB(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected ProductGroupDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected ProductGroupDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected ProductGroupDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(com.binarysprite.evemat.entity.ProductGroup entity) {
        entering("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.ProductGroup> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.ProductGroup>(com.binarysprite.evemat.entity._ProductGroup.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductGroupDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.binarysprite.evemat.entity.ProductGroup entity) {
        entering("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.ProductGroup> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.ProductGroup>(com.binarysprite.evemat.entity._ProductGroup.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductGroupDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.binarysprite.evemat.entity.ProductGroup> selectAll() {
        entering("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "selectAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/ProductGroupDao/selectAll.sql");
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductGroupDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.binarysprite.evemat.entity.ProductGroup>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.binarysprite.evemat.entity.ProductGroup>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.binarysprite.evemat.entity.ProductGroup>(com.binarysprite.evemat.entity._ProductGroup.getSingletonInternal()));
            java.util.List<com.binarysprite.evemat.entity.ProductGroup> __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.binarysprite.evemat.entity.ProductGroup selectById(java.lang.Integer id) {
        entering("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "selectById", id);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/ProductGroupDao/selectById.sql");
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductGroupDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.ProductGroup> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.ProductGroup>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.binarysprite.evemat.entity.ProductGroup>(com.binarysprite.evemat.entity._ProductGroup.getSingletonInternal()));
            com.binarysprite.evemat.entity.ProductGroup __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.binarysprite.evemat.entity.ProductGroup entity) {
        entering("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.ProductGroup> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.ProductGroup>(com.binarysprite.evemat.entity._ProductGroup.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductGroupDaoImpl");
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
            exiting("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductGroupDaoImpl", "update", __e);
            throw __e;
        }
    }

}
