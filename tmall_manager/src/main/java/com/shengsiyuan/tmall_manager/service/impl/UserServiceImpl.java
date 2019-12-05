package com.shengsiyuan.tmall_manager.service.impl;

import com.shengsiyuan.tmall_manager.bean.UserAccount;
import com.shengsiyuan.tmall_manager.mapper.UserMapper;
import com.shengsiyuan.tmall_manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public UserAccount queryUser(UserAccount userAccount) {
        system.out.pringln("hello");
        return userMapper.selectUser(userAccount);
    }
}
