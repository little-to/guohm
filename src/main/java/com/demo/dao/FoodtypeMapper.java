package com.demo.dao;

import com.demo.entity.Foodtype;

public interface FoodtypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foodtype record);

    int insertSelective(Foodtype record);

    Foodtype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foodtype record);

    int updateByPrimaryKey(Foodtype record);
}