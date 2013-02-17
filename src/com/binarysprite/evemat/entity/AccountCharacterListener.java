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
public class AccountCharacterListener implements EntityListener<AccountCharacter> {

    @Override
    public void preInsert(AccountCharacter entity, PreInsertContext context) {
    }

    @Override
    public void preUpdate(AccountCharacter entity, PreUpdateContext context) {
    }

    @Override
    public void preDelete(AccountCharacter entity, PreDeleteContext context) {
    }

    @Override
    public void postInsert(AccountCharacter entity, PostInsertContext context) {
    }

    @Override
    public void postUpdate(AccountCharacter entity, PostUpdateContext context) {
    }

    @Override
    public void postDelete(AccountCharacter entity, PostDeleteContext context) {
    }
}