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
public interface IconDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

    /**
     * @param iconId
     * @return the Icon entity
     */
    @Select
    Icon selectById(Integer iconId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Icon entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Icon entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Icon entity);
}