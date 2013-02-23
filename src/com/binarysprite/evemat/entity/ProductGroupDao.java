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
public interface ProductGroupDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

    /**
     * @param id
     * @return the ProductGroup entity
     */
    @Select
    ProductGroup selectById(Integer id);
    
    /**
     * 
     * @return
     */
    @Select
    List<ProductGroup> selectAll();

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ProductGroup entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ProductGroup entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ProductGroup entity);
}