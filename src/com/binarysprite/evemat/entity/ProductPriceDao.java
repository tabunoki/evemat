package com.binarysprite.evemat.entity;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Script;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.binarysprite.evemat.DB;
import com.binarysprite.evemat.entity.sub.ProductionPlan;

/**
 */
@Dao(config = DB.class)
public interface ProductPriceDao {

	/**
	 * テーブルを作成します。
	 */
	@Script
	void createTable();

    /**
     * @param typeId
     * @return the ProductPrice entity
     */
    @Select
    ProductPrice selectById(Integer typeId);
    
    /**
     * 
     * @return
     */
    @Select
    List<ProductionPlan> selectProductionPlan(int groupId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ProductPrice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ProductPrice entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ProductPrice entity);
}