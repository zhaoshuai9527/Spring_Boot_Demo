package com.zs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;
import java.io.Serializable;

@Entity
@Table(name = "tf_user")
public class User implements Serializable {
    @Id
    private int userId;
    private String name;
    private int age;
    private String sex;
    private String password;
    private Data registerData;//注册时间

    public User() {
    }

    public User(String name, int age, String sex, String password, Data registerData) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.password = password;
        this.registerData = registerData;
    }
    public User(int userId, String name, int age, String sex, String password, Data registerData) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.password = password;
        this.registerData = registerData;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Data getRegisterData() {
        return registerData;
    }

    public void setRegisterData(Data registerData) {
        this.registerData = registerData;
    }
}
