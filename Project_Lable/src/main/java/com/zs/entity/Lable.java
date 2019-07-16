package com.zs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Table(name = "tf_Lable")
public class Lable implements Serializable {
    @Id //ID为主键   javax.persistence.Id
    private String ID;
    private String Name;
    private int Age;
    private String Sex;
    private String Stature; //身高
    private String Hobby;

    public Lable() {
    }
    public Lable( String name, int age, String sex, String stature, String hobby) {
        Name = name;
        Age = age;
        Sex = sex;
        Stature = stature;
        Hobby = hobby;
    }
    public Lable(String ID, String name, int age, String sex, String stature, String hobby) {
        this.ID = ID;
        Name = name;
        Age = age;
        Sex = sex;
        Stature = stature;
        Hobby = hobby;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getStature() {
        return Stature;
    }

    public void setStature(String stature) {
        Stature = stature;
    }

    public String getHobby() {
        return Hobby;
    }

    public void setHobby(String hobby) {
        Hobby = hobby;
    }
}
