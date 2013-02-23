package com.binarysprite.evemat.entity;

import java.util.List;

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
public interface TypeDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

	/**
	 * @param typeId
	 * @return the Type entity
	 */
	@Select
	Type selectById(Integer typeId);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(Type entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(Type entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(Type entity);

	/**
	 * 
	 * @param name
	 * @return
	 */
	@Select
	List<Type> selectByName(String typeName);
	
	/**
	 * 
	 * @param name
	 * @return
	 */
	@Select
	Type selectOneByName(String typeName);
}