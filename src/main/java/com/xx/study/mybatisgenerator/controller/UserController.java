package com.xx.study.mybatisgenerator.controller;

import com.xx.study.mybatisgenerator.pojo.User;
import com.xx.study.mybatisgenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // 增加用户
    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(User user){
        return userService.addUser(user);
    }

    // 查询所有用户
    @ResponseBody
    @RequestMapping("/selectAllUser")
    public List<User> selectAllUser(){
        List<User> list = userService.selectAllUser();
        System.out.println(list);
        return null;
    }


    @RequestMapping("/selectUser")
    public void  selectUser(){
        User user = userService.selectByPrimaryKey(1);
        System.out.println(user.getUsername());
    }
}
