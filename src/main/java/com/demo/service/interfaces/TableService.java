package com.demo.service.interfaces;

import com.demo.entity.Dinnertable;

import java.util.List;

public interface TableService {
    /**
     * 查询所有餐桌
     */
    List<Dinnertable> queryAllTables();

    void addTable(Dinnertable dinnertable);

    Dinnertable searchByTableName(String tableName);
}
