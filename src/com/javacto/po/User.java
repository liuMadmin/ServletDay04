package com.javacto.po;
/*
* 数据库对应实体类
* */
import java.util.Date;

public class User {
    private  int id;
    private  String userName;
    private  String pwd;
    private  String sex;
    private Date date;
    private  String address;

    public User() {
    }

    public User(int id, String userName, String pwd, String sex, Date date, String address) {
        this.id = id;
        this.userName = userName;
        this.pwd = pwd;
        this.sex = sex;
        this.date = date;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex='" + sex + '\'' +
                ", date=" + date +
                ", address='" + address + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
