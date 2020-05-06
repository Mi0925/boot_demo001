package com.tx.boot_demo001.dao.impl;

import com.tx.boot_demo001.dao.IUserDao;
import com.tx.boot_demo001.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {

    @Override
    public User getUser(String name, String password) {
        if(name.equals("范冰冰") && password.equals("123")){
            User su=new User(1,name,password,26);
            return su;
        }
        return null;
    }
}
