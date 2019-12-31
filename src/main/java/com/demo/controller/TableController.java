package com.demo.controller;

import com.demo.entity.Dinnertable;
import com.demo.service.Impl.TableServiceImpl;
import com.demo.service.interfaces.TableService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * 餐桌管理
 */
@Controller
public class TableController {
    @Autowired
    @Qualifier("tableService")
    private TableService tableService;

    /**
     *查询所有餐桌
     * @param mo
     * @return
     */
    @RequestMapping("/queryTable")
    public String queryAllTables(ModelMap mo,@RequestParam( required =false,value = "tablename") String tableName){
        List<Dinnertable> list;
        if(null == tableName || "".equals(tableName)){
            list = tableService.queryAllTables();
        }else{
            Dinnertable dinnertable = tableService.searchByTableName(tableName);
            list = new ArrayList<Dinnertable>();
            list.add(dinnertable);
        }
        mo.addAttribute("list",list);
        return "sys/board/boardList";
    }

    /**
     * 添加餐桌
     * @param tableName
     */
    @RequestMapping("/addTable")
    @ResponseBody
    public Object addTable(@RequestBody String tableName)throws Exception{
        // 去除字符串的双引号
        String data = tableName.substring(1,tableName.length()-1);
        Dinnertable dinnertable = new Dinnertable();
            if(data != null && !"".equals(data)){
                dinnertable.setTablename(data);
                dinnertable.setTablestatus(0);
                tableService.addTable(dinnertable);
            }
        dinnertable.setReserve1("000000");
        return dinnertable;
    }

    @RequestMapping("/delTable")
    @ResponseBody
    public Object delTable(@RequestBody int id)throws Exception{
        tableService.delTable(id);
        Object object = new Object();
        return object;
    }

}
