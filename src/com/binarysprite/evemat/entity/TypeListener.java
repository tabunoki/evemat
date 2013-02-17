package com.binarysprite.evemat.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class TypeListener implements EntityListener<Type> {

    @Override
    public void preInsert(Type entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(Type entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(Type entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(Type entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(Type entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(Type entity, PostDeleteContext context) {
    }
}