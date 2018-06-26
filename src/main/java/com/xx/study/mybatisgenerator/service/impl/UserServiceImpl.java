package com.xx.study.mybatisgenerator.service.impl;

import com.xx.study.mybatisgenerator.dao.UserMapper;
import com.xx.study.mybatisgenerator.pojo.User;
import com.xx.study.mybatisgenerator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String addUser(User user) {
        if(user.getId()==null){
            Integer i = userMapper.insert(user);
            if(i!=0&&i!=null)
                return "success";
        }
        return null;
    }

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }

    @Override
    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
