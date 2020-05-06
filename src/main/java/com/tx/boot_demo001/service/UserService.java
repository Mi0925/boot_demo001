package com.tx.boot_demo001.service;

import com.tx.boot_demo001.pojo.User;

public interface UserService {
    User login(String name,String password);
}
