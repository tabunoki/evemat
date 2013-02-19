package com.binarysprite.evemat.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.25.0" }, date = "2013-02-19T21:52:06.018+0900")
public class TypeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.binarysprite.evemat.entity.TypeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.25.0");
    }

    /** */
    public TypeDaoImpl() {
        super(new com.binarysprite.evemat.DB());
    }

    /**
     * @param connection the connection
     */
    public TypeDaoImpl(java.sql.Connection connection) {
        super(new com.binarysprite.evemat.DB(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public TypeDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.binarysprite.evemat.DB(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected TypeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected TypeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected TypeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int delete(com.binarysprite.evemat.entity.Type entity) {
        entering("com.binarysprite.evemat.entity.TypeDaoImpl", "delete", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.Type> __query = new org.seasar.doma.internal.jdbc.query.AutoDeleteQuery<com.binarysprite.evemat.entity.Type>(com.binarysprite.evemat.entity._Type.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.TypeDaoImpl");
            __query.setCallerMethodName("delete");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.TypeDaoImpl", "delete", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.TypeDaoImpl", "delete", __e);
            throw __e;
        }
    }

    @Override
    public int insert(com.binarysprite.evemat.entity.Type entity) {
        entering("com.binarysprite.evemat.entity.TypeDaoImpl", "insert", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.Type> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.binarysprite.evemat.entity.Type>(com.binarysprite.evemat.entity._Type.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.TypeDaoImpl");
            __query.setCallerMethodName("insert");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.TypeDaoImpl", "insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.TypeDaoImpl", "insert", __e);
            throw __e;
        }
    }

    @Override
    public com.binarysprite.evemat.entity.Type selectById(java.lang.Integer typeId) {
        entering("com.binarysprite.evemat.entity.TypeDaoImpl", "selectById", typeId);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/TypeDao/selectById.sql");
            __query.addParameter("typeId", java.lang.Integer.class, typeId);
            __query.setCallerClassName("com.binarysprite.evemat.entity.TypeDaoImpl");
            __query.setCallerMethodName("selectById");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.Type> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.Type>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.binarysprite.evemat.entity.Type>(com.binarysprite.evemat.entity._Type.getSingletonInternal()));
            com.binarysprite.evemat.entity.Type __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.TypeDaoImpl", "selectById", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.TypeDaoImpl", "selectById", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.binarysprite.evemat.entity.Type> selectByName(java.lang.String typeName) {
        entering("com.binarysprite.evemat.entity.TypeDaoImpl", "selectByName", typeName);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/TypeDao/selectByName.sql");
            __query.addParameter("typeName", java.lang.String.class, typeName);
            __query.setCallerClassName("com.binarysprite.evemat.entity.TypeDaoImpl");
            __query.setCallerMethodName("selectByName");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.binarysprite.evemat.entity.Type>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.binarysprite.evemat.entity.Type>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.binarysprite.evemat.entity.Type>(com.binarysprite.evemat.entity._Type.getSingletonInternal()));
            java.util.List<com.binarysprite.evemat.entity.Type> __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.TypeDaoImpl", "selectByName", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.TypeDaoImpl", "selectByName", __e);
            throw __e;
        }
    }

    @Override
    public com.binarysprite.evemat.entity.Type selectOneByName(java.lang.String typeName) {
        entering("com.binarysprite.evemat.entity.TypeDaoImpl", "selectOneByName", typeName);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/binarysprite/evemat/entity/TypeDao/selectOneByName.sql");
            __query.addParameter("typeName", java.lang.String.class, typeName);
            __query.setCallerClassName("com.binarysprite.evemat.entity.TypeDaoImpl");
            __query.setCallerMethodName("selectOneByName");
            __query.setResultEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.Type> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.binarysprite.evemat.entity.Type>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.binarysprite.evemat.entity.Type>(com.binarysprite.evemat.entity._Type.getSingletonInternal()));
            com.binarysprite.evemat.entity.Type __result = __command.execute();
            __query.complete();
            exiting("com.binarysprite.evemat.entity.TypeDaoImpl", "selectOneByName", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.TypeDaoImpl", "selectOneByName", __e);
            throw __e;
        }
    }

    @Override
    public int update(com.binarysprite.evemat.entity.Type entity) {
        entering("com.binarysprite.evemat.entity.TypeDaoImpl", "update", entity);
        try {
            if (entity == null) {
                throw new org.seasar.doma.DomaNullPointerException("entity");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.Type> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.binarysprite.evemat.entity.Type>(com.binarysprite.evemat.entity._Type.getSingletonInternal());
            __query.setConfig(config);
            __query.setEntity(entity);
            __query.setCallerClassName("com.binarysprite.evemat.entity.TypeDaoImpl");
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
            exiting("com.binarysprite.evemat.entity.TypeDaoImpl", "update", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.binarysprite.evemat.entity.TypeDaoImpl", "update", __e);
            throw __e;
        }
    }

}
