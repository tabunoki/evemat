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
public class MaterialListener implements EntityListener<Material> {

    @Override
    public void preInsert(Material entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(Material entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(Material entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(Material entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(Material entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(Material entity, PostDeleteContext context) {
    }
}