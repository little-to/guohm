package com.demo.dao;

import com.demo.entity.Admin;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class AdminMapperTest {

    private ApplicationContext applicationContext;

    @Autowired
    private AdminMapper mapper;
    @Before
    public void setUp() throws Exception {
        // 加载spring配置文件
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        // 导入需要测试的
        mapper = applicationContext.getBean(AdminMapper.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void insert() throws Exception {
        Admin message = new Admin();
        message.setId("1");
        message.setName("张三");
        message.setPassword("123456");
        int result = mapper.insert(message);
        System.out.println(result);
        assert (result == 1);
    }
}