package com.binarysprite.evemat.entity;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Script;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.jdbc.SelectOptions;

import com.binarysprite.evemat.DB;

/**
 */
@Dao(config = DB.class)
public interface WalletTransactionDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

    /**
     * @param transactionId
     * @return the WalletTransaction entity
     */
    @Select
    WalletTransaction selectById(Long transactionId);
    
    /**
     * 
     * @param limit
     * @param offset
     * @return
     */
    @Select
    List<WalletTransaction> selectAll(SelectOptions options);
    
    /**
     * 
     * @return
     */
    @Select
    int count();

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(WalletTransaction entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(WalletTransaction entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(WalletTransaction entity);
}