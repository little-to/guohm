package com.demo.dao;

import com.demo.entity.Sumday;

public interface SumdayMapper {
    int insert(Sumday record);

    int insertSelective(Sumday record);
}