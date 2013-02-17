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
public class WalletJournalListener implements EntityListener<WalletJournal> {

    @Override
    public void preInsert(WalletJournal entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(WalletJournal entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(WalletJournal entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(WalletJournal entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(WalletJournal entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(WalletJournal entity, PostDeleteContext context) {
    }
}