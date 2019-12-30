package com.demo.service.Impl;

import com.demo.dao.DinnertableMapper;
import com.demo.entity.Dinnertable;
import com.demo.service.interfaces.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tableService")
public class TableServiceImpl implements TableService {

    @Autowired
    private DinnertableMapper tableMapper;
    /**
     * 查询所有餐桌
     * @return
     */
    @Override
    public List<Dinnertable> queryAllTables() {
      return tableMapper.queryAllTables();
    }

    @Override
    public void addTable(Dinnertable dinnertable) {
        this.tableMapper.insert(dinnertable);
    }

    @Override
    public Dinnertable searchByTableName(String tableName) {
        return tableMapper.searchByTableName(tableName);
    }
}
