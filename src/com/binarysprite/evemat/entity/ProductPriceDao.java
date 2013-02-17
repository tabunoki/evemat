package com.binarysprite.evemat.entity;

import java.util.List;
import java.util.Map;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.binarysprite.evemat.DB;

/**
 */
@Dao(config = DB.class)
public interface ProductPriceDao {

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
    List<Map<String, Object>> selectManufactureTable();

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