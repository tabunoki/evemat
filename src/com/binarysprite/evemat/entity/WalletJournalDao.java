package com.binarysprite.evemat.entity;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Script;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.binarysprite.evemat.DB;

/**
 */
@Dao(config = DB.class)
public interface WalletJournalDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

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