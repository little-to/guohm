package com.demo.dao;

import com.demo.entity.Food;

import java.util.List;

public interface FoodMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    List<Food> selectBySQL(String sql);

    int selectBySQLCount(String sql);
}