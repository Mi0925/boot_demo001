package com.tx.boot_demo001.service.impl;

import com.tx.boot_demo001.dao.IUserDao;
import com.tx.boot_demo001.pojo.User;
import com.tx.boot_demo001.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserDao iud;

    @Override
    public User login(String name, String password) {

        return iud.getUser(name,password);
    }
}
