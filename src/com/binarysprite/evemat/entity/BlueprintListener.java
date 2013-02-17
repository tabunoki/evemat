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
public class BlueprintListener implements EntityListener<Blueprint> {

    @Override
    public void preInsert(Blueprint entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(Blueprint entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(Blueprint entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(Blueprint entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(Blueprint entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(Blueprint entity, PostDeleteContext context) {
    }
}