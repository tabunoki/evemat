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
public class IconListener implements EntityListener<Icon> {

    @Override
    public void preInsert(Icon entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(Icon entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(Icon entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(Icon entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(Icon entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(Icon entity, PostDeleteContext context) {
    }
}