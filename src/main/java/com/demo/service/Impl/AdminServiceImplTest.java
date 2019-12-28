package com.demo.service.Impl;

import com.demo.dao.AdminMapper;
import com.demo.entity.Admin;
import com.demo.service.interfaces.AdminServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *   测试spring MVC
 */
@Service("adminService")
public class AdminServiceImplTest implements AdminServiceTest {

    /**
     * 自动注入
     */
    @Autowired
    private AdminMapper adminMapper;

    /**
     *
     * @param loginName
     * @param password
     * @return
     */
    @Override
    public Admin login(String loginName, String password) {
        return adminMapper.findByLoginnameAndPassword(loginName,password);
    }
}
