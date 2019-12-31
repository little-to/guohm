package com.demo.service.interfaces;

import com.demo.entity.Food;
import com.demo.utils.PageBean;

public interface FoodService {
    int deleteByPrimaryKey(Integer id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);

    void queryByPageBean(PageBean<Food> pb);
}
