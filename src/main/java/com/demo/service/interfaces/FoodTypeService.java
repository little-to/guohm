package com.demo.service.interfaces;

import com.demo.entity.Foodtype;

import java.util.List;

public interface FoodTypeService {

    List<Foodtype> queryAllFootType();

    Foodtype queryFootTypeById(String id);

    int delFoodType(String id);

    int addFoodType(Foodtype foodtype);

    int updateFoodType(Foodtype foodtype);
}
