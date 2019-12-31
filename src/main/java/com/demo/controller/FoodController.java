package com.demo.controller;

import com.demo.entity.Food;
import com.demo.entity.Foodtype;
import com.demo.service.interfaces.FoodService;
import com.demo.service.interfaces.FoodTypeService;
import com.demo.utils.Condition;
import com.demo.utils.PageBean;
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
public class FoodController {

    @Autowired
    @Qualifier("foodService")
    private FoodService foodService;

    @Autowired
    private FoodTypeService foodTypeService;

    @RequestMapping("/foodList")
    public String foodList(ModelMap mo, @RequestParam(required = false,value = "page")String page,
                           @RequestParam(required = false,value = "foodname")String foodname){
            String currPage;
           if(null == page || "".equals(page)){
               currPage = "1";
           }else{
               currPage = page;
           }
           int IPage = Integer.parseInt(currPage);
            PageBean<Food> pageBean = new PageBean<Food>();
            // 设置当前页
            pageBean.setCurrentPage(IPage);

            if(null != foodname && !"".equals(foodname)){
                Condition condition = new Condition();
                pageBean.setCondition(condition);
                pageBean.getCondition().setFoodName(foodname);
            }
            // 获取数据
            foodService.queryByPageBean(pageBean);

            List<Food> list = pageBean.getPageData();

            //获取食物类别
            List<Foodtype> types = new ArrayList<Foodtype>();
            if (list != null) {
                for (Food food : list) {
                    Foodtype foodtype = foodTypeService.queryFootTypeById(String.valueOf(food.getId()));
                    types.add(foodtype);
                }
            }
            mo.addAttribute("list",list);
            mo.addAttribute("types",types);
            mo.addAttribute("pageBean",pageBean);

        return "sys/food/foodList";
    }
    @RequestMapping("/selectOneFoodById")
    public String selectOneFoodById(ModelMap mo,@RequestParam("id") String id){
        Food food = this.foodService.selectByPrimaryKey(Integer.parseInt(id));
        List<Foodtype> foodtypes = foodTypeService.queryAllFootType();
        mo.addAttribute("foodtypes",foodtypes);
        mo.addAttribute("food",food);
        return "sys/food/updateFood";
    }
    @RequestMapping("/updateFood")
    @ResponseBody
    public Integer updateFood(@RequestBody Food food){
        int flag = 0;
        if (null != food && food.getId() != null){
            flag = this.foodService.updateByPrimaryKeySelective(food);
        }
        return flag;
    }

    @RequestMapping("/delFoodById")
    @ResponseBody
    public Integer delFoodById(@RequestBody String id){
        int flag = 0;
        if(null != id && !"".equals(id)){
            flag = foodService.deleteByPrimaryKey(Integer.parseInt(id));
        }
        return flag;
    }

    @RequestMapping("/getFoodTypes")
    public String addFood(ModelMap mo){
        List<Foodtype> foodtypes = foodTypeService.queryAllFootType();
        mo.addAttribute("types",foodtypes);
        return "sys/food/saveFood";
    }
}
