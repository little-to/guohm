package com.demo.service.Impl;

import com.demo.dao.FoodMapper;
import com.demo.entity.Food;
import com.demo.entity.Foodtype;
import com.demo.service.interfaces.FoodService;
import com.demo.service.interfaces.FoodTypeService;
import com.demo.utils.Condition;
import com.demo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("foodService")
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return foodMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Food record) {
        return 0;
    }

    @Override
    public int insertSelective(Food record) {
        return 0;
    }

    @Override
    public Food selectByPrimaryKey(Integer id) {
        return foodMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Food record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Food record) {
        return 0;
    }

    @Override
    public void queryByPageBean(PageBean<Food> pb) {
        int totalCount = this.getTotalCount(pb);
        pb.setTotalCount(totalCount);

        List<Object> list = new ArrayList<Object>();

        if (pb.getCurrentPage() <= 0) {
            pb.setCurrentPage(1); // 把当前页设置为1
        } else if (pb.getCurrentPage() > pb.getTotalPage()) {
            pb.setCurrentPage(pb.getTotalPage()); // 把当前页设置为最大页数
        }

        // 获取当前页： 计算查询的起始行、返回的行数
        int currentPage = pb.getCurrentPage();
        int index = (currentPage - 1) * pb.getPageCount(); // 查询的起始行
        int count = pb.getPageCount(); // 查询返回的行数

        Condition condition = pb.getCondition();

        // 分页查询数据; 把查询到的数据设置到pb对象中
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT *");
        sb.append(" FROM ");
        sb.append("     	food f");
        sb.append(" WHERE 	1=1 ");

        // 判断
        if (condition != null) {
            String foodName = condition.getFoodName();
            if (foodName != null && !foodName.isEmpty()) {
                sb.append("  AND f.foodName LIKE  "+"'%" + foodName + "%'");
            }

            int type_id = condition.getFoodType_id();
            if (type_id > 0) {
                sb.append(" AND f.foodtypeId= "+type_id);
            }
        }
        sb.append(" limit "+index+","+count);
        try {
            // 根据当前页，查询当前页数据(一页数据)
            if (index >= 0) {
                List<Food> pageData = foodMapper.selectBySQL(sb.toString());
                // 设置到pb对象中
                pb.setPageData(pageData);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getTotalCount(PageBean<Food> pb) {
        StringBuilder sb = new StringBuilder();
        sb.append(" SELECT");
        sb.append("   count(*) ");
        sb.append(" FROM ");
        sb.append("     	food f");
        sb.append(" WHERE 	1=1 ");

        Condition condition = pb.getCondition();
        // 判断
        if (condition != null) {
            String foodName = condition.getFoodName();
            if (foodName != null && !foodName.isEmpty()) {
                sb.append("  AND f.foodName LIKE "+"'%" + foodName + "%'");
            }

            int type_id = condition.getFoodType_id();
            if (type_id > 0) {
                sb.append(" AND f.foodtypeId="+type_id);
            }
        }
        try {
            // 执行查询， 返回结果的第一行的第一列
            int count = foodMapper.selectBySQLCount(sb.toString());
            return count;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
