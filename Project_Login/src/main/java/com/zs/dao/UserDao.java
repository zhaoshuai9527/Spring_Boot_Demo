package com.zs.dao;

import com.zs.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import sun.security.util.Password;

public interface UserDao extends JpaRepository<User,String>, JpaSpecificationExecutor<User> {

    public User findUserByNameAndPassword(String userName,String password) ;
}
