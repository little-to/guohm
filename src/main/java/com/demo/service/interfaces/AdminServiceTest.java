package com.demo.service.interfaces;

import com.demo.entity.Admin;

public interface AdminServiceTest {
    /**
     * 测试springMVC  用户登录判断
     * @param loginName
     * @param password
     * @return
     */
    Admin login(String loginName, String password);
}
