package com.baizhi.yqs.controller;

import com.baizhi.yqs.entity.User;
import com.baizhi.yqs.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;
    @ResponseBody
    @RequestMapping("getAllUser")
    public List<User> getAllUser(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
    @RequestMapping("getAll")
    public String getAllUser1(){
        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user);
        }
        return "index";
    }

}
