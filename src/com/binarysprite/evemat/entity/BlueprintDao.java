package com.binarysprite.evemat.entity;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Script;
import org.seasar.doma.Update;

import com.binarysprite.evemat.DB;

/**
 */
@Dao(config = DB.class)
public interface BlueprintDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(Blueprint entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(Blueprint entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(Blueprint entity);

}