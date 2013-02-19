package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:05.996+0900")
public class ProductBlueprintDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.binarysprite.evemat.entity.ProductBlueprintDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    /** */
    public ProductBlueprintDaoImpl() {
        super(new com.binarysprite.evemat.DB());
    }

    /**
     * @param connection the connection
     */
    public ProductBlueprintDaoImpl(java.sql.Connection connection) {
        super(new com.binarysprite.evemat.DB(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public ProductBlueprintDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.binarysprite.evemat.DB(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected ProductBlueprintDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected ProductBlueprintDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected ProductBlueprintDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(com.binarysprite.evemat.entity.ProductBlueprint entity) {
        entering("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.ProductBlueprint> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.ProductBlueprint>(com.binarysprite.evemat.entity._ProductBlueprint.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.binarysprite.evemat.entity.ProductBlueprint entity) {
        entering("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.ProductBlueprint> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.ProductBlueprint>(com.binarysprite.evemat.entity._ProductBlueprint.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.binarysprite.evemat.entity.ProductBlueprint> selectAll() {
        entering("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/ProductBlueprintDao/selectAll.sql");
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.binarysprite.evemat.entity.ProductBlueprint>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.binarysprite.evemat.entity.ProductBlueprint>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.binarysprite.evemat.entity.ProductBlueprint>(com.binarysprite.evemat.entity._ProductBlueprint.getSingletonInternal()));
            java.util.List<com.binarysprite.evemat.entity.ProductBlueprint> __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.binarysprite.evemat.entity.ProductBlueprint selectById(java.lang.Integer id) {
        entering("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectById", id);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/ProductBlueprintDao/selectById.sql");
            __query.addParameter("id", java.lang.Integer.class, id);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.ProductBlueprint> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.ProductBlueprint>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.binarysprite.evemat.entity.ProductBlueprint>(com.binarysprite.evemat.entity._ProductBlueprint.getSingletonInternal()));
            com.binarysprite.evemat.entity.ProductBlueprint __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<java.lang.Integer> selectProductAndMaterialIdList() {
        entering("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectProductAndMaterialIdList");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/ProductBlueprintDao/selectProductAndMaterialIdList.sql");
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl");
            __query.setCallerMethodName("selectProductAndMaterialIdList");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.lang.Integer>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<java.lang.Integer>>(__query, new org.seasar.doma.internal.jdbc.command.BasicResultListHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper()));
            java.util.List<java.lang.Integer> __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectProductAndMaterialIdList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "selectProductAndMaterialIdList", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.binarysprite.evemat.entity.ProductBlueprint entity) {
        entering("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.ProductBlueprint> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.ProductBlueprint>(com.binarysprite.evemat.entity._ProductBlueprint.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl");
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
            exiting("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.ProductBlueprintDaoImpl", "update", __e);
            throw __e;
        }
    }

}
