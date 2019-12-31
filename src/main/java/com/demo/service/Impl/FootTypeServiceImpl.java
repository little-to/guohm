package com.demo.service.Impl;

import com.demo.dao.FoodtypeMapper;
import com.demo.entity.Foodtype;
import com.demo.service.interfaces.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("foodTypeService")
public class FootTypeServiceImpl implements FoodTypeService {

    @Autowired
    private FoodtypeMapper foodtypeMapper;
    @Override
    public List<Foodtype> queryAllFootType() {
        return this.foodtypeMapper.queryAllFoodType();
    }

    @Override
    public Foodtype queryFootTypeById(String id) {
        int ids = Integer.parseInt(id);
        return foodtypeMapper.selectByPrimaryKey(ids);
    }

    @Override
    public int delFoodType(String id) {
       int ids = Integer.parseInt(id.substring(1,id.length()-1));
        return this.foodtypeMapper.deleteByPrimaryKey(ids);
    }

    @Override
    public int addFoodType(Foodtype foodtype) {
        return this.foodtypeMapper.insert(foodtype);
    }

    @Override
    public int updateFoodType(Foodtype foodtype) {
        return foodtypeMapper.updateByPrimaryKey(foodtype);
    }
}
