package com.tx.boot_demo001.dao;

import com.tx.boot_demo001.pojo.User;

public interface IUserDao {
    public User getUser(String name,String password);
}
