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
public class RequirementListener implements EntityListener<Requirement> {

    @Override
    public void preInsert(Requirement entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(Requirement entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(Requirement entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(Requirement entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(Requirement entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(Requirement entity, PostDeleteContext context) {
    }
}