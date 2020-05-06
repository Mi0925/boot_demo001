package com.tx.boot_demo001.controller;

import com.alibaba.fastjson.JSON;
import com.tx.boot_demo001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    private UserService us;

    @RequestMapping("login")
    @ResponseBody
    public String login(String name,String password){

        // 校验参数
        System.out.println("controller--->name:" + name + ",password:" + password);

        //调用业务层，查询用户，存在返回用户信息，不存在返回null
        if(us.login(name,password) !=null){
            return JSON.toJSONString(us.login(name,password));
        }
        return null;
    }
}
