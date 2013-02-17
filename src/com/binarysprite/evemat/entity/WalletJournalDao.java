package com.binarysprite.evemat.entity;

import com.binarysprite.evemat.DB;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DB.class)
public interface WalletJournalDao {

    /**
     * @param refId
     * @return the WalletJournal entity
     */
    @Select
    WalletJournal selectById(Long refId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(WalletJournal entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(WalletJournal entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(WalletJournal entity);
}