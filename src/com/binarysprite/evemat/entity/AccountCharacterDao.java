package com.binarysprite.evemat.entity;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

import com.binarysprite.evemat.DB;

/**
 */
@Dao(config = DB.class)
public interface AccountCharacterDao {

    /**
     * @param characterId
     * @return the AccountCharacter entity
     */
    @Select
    AccountCharacter selectById(Long characterId);
    
    @Select
    List<AccountCharacter> selectAll();

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(AccountCharacter entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(AccountCharacter entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(AccountCharacter entity);
}