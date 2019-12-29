package com.demo.controller;

import com.demo.entity.Admin;
import com.demo.service.Impl.AdminServiceImplTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 测试用例
 */
@Controller
public class ControllerTest {
    /**
     * 自动注入
     */
    @Autowired
    @Qualifier("adminService")
    private AdminServiceImplTest adminServiceImplTest;

    /**
     * 处理login请求
     * @param loginname
     * @param password
     * @param mv
     * @param session
     * @return
     */
    @RequestMapping(value="/login")
    public ModelAndView login(String loginname, String password, ModelAndView mv, HttpSession session){
        Admin admin = adminServiceImplTest.login(loginname,password);
        if(null != admin){
            session.setAttribute("admin",admin);
            mv.setView(new RedirectView("/guohm_war_exploded/jsp/loginSuccess.jsp"));
        }else{
            mv.addObject("message","登录失败");
            mv.setViewName("index");
        }
        return mv;
    }

    /**
     * JSON 格式数据处理 （方法一）
     * @param admin
     * @param response
     * @throws Exception
     */
    @RequestMapping("/json1")
    public void jsonTest(@RequestBody Admin admin, HttpServletResponse response) throws Exception{
        Admin resultData = adminServiceImplTest.getAdminById(admin.getId());
        // @RequestBody 根据json数据，转换成对应的object
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValueAsString(resultData);
        response.setContentType("text/html;charset=UTF-8");
        // 将对象输出到客户端
        response.getWriter().println(mapper.writeValueAsString(resultData));
    }
    @RequestMapping("/json2")
    @ResponseBody
    public Object jsonTest2(@RequestBody String id){
        Admin resultData = adminServiceImplTest.getAdminById(id);
        return resultData;
    }
}
