package com.demo.dao;

import com.demo.entity.Foodtype;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodtypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Foodtype record);

    int insertSelective(Foodtype record);

    Foodtype selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Foodtype record);

    int updateByPrimaryKey(Foodtype record);

    @Select("select * from foodtype")
    List<Foodtype> queryAllFoodType();
}