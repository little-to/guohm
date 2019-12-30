package com.demo.dao;

import com.demo.entity.Dinnertable;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DinnertableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dinnertable record);

    int insertSelective(Dinnertable record);

    Dinnertable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dinnertable record);

    int updateByPrimaryKey(Dinnertable record);

    @Select("select * from dinnertable")
    List<Dinnertable> queryAllTables();

    @Select("select * from dinnertable where tablename like concat('%',#{tablename},'%')")
    Dinnertable searchByTableName(@Param("tablename") String tableName);
}