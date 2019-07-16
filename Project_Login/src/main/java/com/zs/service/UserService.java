package com.zs.service;

import com.zs.Result.Result;
import com.zs.dao.UserDao;
import com.zs.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User findUserNameAndPassword(String userName, String password){
        User user = userDao.findUserByNameAndPassword(userName,password);
        if (user != null && user.getPassword().equals())
        return
    }
}
