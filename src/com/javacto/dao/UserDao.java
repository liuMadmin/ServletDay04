package com.javacto.dao;
/*
* dao层   操作数据库
* */
import com.javacto.po.User;

import java.util.HashMap;
import java.util.List;

public interface UserDao {
    /**
     * 添加
     */
    public  int addUser(User user);

    /**
     * 删除
     */
    public  int deleteUser(int id);

    /**
     * 根据ID查询
     */
    public List<Object> queryUserByID(int id);


    /**
     * 修改
     */
    public  int updateUser(User user);

    /**
     * 查询所有
     */
    public List<Object> queryAll();

    public List<Object> queryAll2();

    /*
    * 查询用户名与密码
    * */
    public HashMap<String,String> queryUserNP();
}
