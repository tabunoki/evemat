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
public interface ProductBlueprintDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

	/**
	 * @param id
	 * @return the ProductBlueprint entity
	 */
	@Select
	ProductBlueprint selectById(Integer id);

	/**
	 * 
	 * @return
	 */
	@Select
	List<ProductBlueprint> selectAll();
	
	/**
	 * 
	 * @return
	 */
	@Select
	List<Integer> selectProductAndMaterialIdList();

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Insert
	int insert(ProductBlueprint entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Update
	int update(ProductBlueprint entity);

	/**
	 * @param entity
	 * @return affected rows
	 */
	@Delete
	int delete(ProductBlueprint entity);
}