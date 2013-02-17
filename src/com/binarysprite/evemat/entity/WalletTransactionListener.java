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
public class WalletTransactionListener implements EntityListener<WalletTransaction> {

    @Override
    public void preInsert(WalletTransaction entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(WalletTransaction entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(WalletTransaction entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(WalletTransaction entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(WalletTransaction entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(WalletTransaction entity, PostDeleteContext context) {
    }
}