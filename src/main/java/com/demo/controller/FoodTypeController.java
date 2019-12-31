package com.demo.controller;

import com.demo.entity.Foodtype;
import com.demo.service.interfaces.FoodTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FoodTypeController {

    @Autowired
    @Qualifier("foodTypeService")
    private FoodTypeService foodTypeService;

    @RequestMapping("getAllFoodType")
    public String queryAllFoodType(ModelMap mo,@RequestParam( required =false,value = "id") String id){
        List<Foodtype> list;
        if(null == id || "".equals(id)){
            list = foodTypeService.queryAllFootType();
        }else{
            list = new ArrayList<Foodtype>();
            Foodtype foodtype = foodTypeService.queryFootTypeById(id);
            list.add(foodtype);
        }
        mo.addAttribute("list",list);
        return "sys/foodtype/cuisineList";
    }

    @RequestMapping("queryFoodTypeById")
    public String queryFoodTypeById(ModelMap mo,@RequestParam("id") String id){
        Foodtype type = foodTypeService.queryFootTypeById(id);
        mo.addAttribute("type",type);
        return "sys/foodtype/updateCuisine";
    }

    @RequestMapping("delFoodTypeById")
    @ResponseBody
    public Integer delTable(@RequestBody String id)throws Exception{
        int flag = 0;
        if(null!=id&&!"".equals(id)){
            flag = foodTypeService.delFoodType(id);
        }
        return flag;
    }

    @RequestMapping("addFoodType")
    @ResponseBody
    public Integer addFoodType(@RequestBody Foodtype foodtype){
        int flag = 0;
        if(null != foodtype){
            flag = foodTypeService.addFoodType(foodtype);
        }
        return flag;
    }

    @RequestMapping("updateFoodType")
    @ResponseBody
    public Integer updateFoodType(@RequestBody Foodtype foodtype){
        if(null != foodtype && foodtype.getId()!=null)
            this.foodTypeService.updateFoodType(foodtype);
        return 0;
    }

}
