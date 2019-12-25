package com.demo.dao;

import com.demo.entity.Dinnertable;

public interface DinnertableMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Dinnertable record);

    int insertSelective(Dinnertable record);

    Dinnertable selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Dinnertable record);

    int updateByPrimaryKey(Dinnertable record);
}