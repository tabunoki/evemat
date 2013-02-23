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
public interface UnitDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

    /**
     * @param unitId
     * @return the Unit entity
     */
    @Select
    Unit selectById(Integer unitId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Unit entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Unit entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Unit entity);
}