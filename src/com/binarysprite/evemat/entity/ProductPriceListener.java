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
public class ProductPriceListener implements EntityListener<ProductPrice> {

    @Override
    public void preInsert(ProductPrice entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(ProductPrice entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(ProductPrice entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(ProductPrice entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(ProductPrice entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(ProductPrice entity, PostDeleteContext context) {
    }
}