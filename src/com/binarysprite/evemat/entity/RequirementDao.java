package com.binarysprite.evemat.entity;

import com.binarysprite.evemat.DB;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Update;

/**
 */
@Dao(config = DB.class)
public interface RequirementDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Requirement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Requirement entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Requirement entity);
}