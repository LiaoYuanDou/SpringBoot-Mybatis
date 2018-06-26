package com.xx.study.mybatisgenerator.service;

import com.xx.study.mybatisgenerator.pojo.User;

import java.util.List;

public interface UserService {

    String addUser(User user);

    List<User> selectAllUser();

    User selectByPrimaryKey(Integer id);
}
