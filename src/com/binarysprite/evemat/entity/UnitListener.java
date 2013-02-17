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
public class UnitListener implements EntityListener<Unit> {

    @Override
    public void preInsert(Unit entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(Unit entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(Unit entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(Unit entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(Unit entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(Unit entity, PostDeleteContext context) {
    }
}