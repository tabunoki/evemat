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
public class ProductBlueprintListener implements EntityListener<ProductBlueprint> {

    @Override
    public void preInsert(ProductBlueprint entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(ProductBlueprint entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(ProductBlueprint entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(ProductBlueprint entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(ProductBlueprint entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(ProductBlueprint entity, PostDeleteContext context) {
    }
}