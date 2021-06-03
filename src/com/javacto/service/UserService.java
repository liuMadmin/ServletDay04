package com.javacto.service;
/*
* 业务层   调用dao层的方法
* */
import com.javacto.po.User;

import java.util.HashMap;
import java.util.List;

public interface UserService {
    /*
     * 添加
     * */
    public int addUser(User user);

    /*
     * 根据id删除
     * */
    public int deleteUser(int id);

    /*
     * 根据id查询
     * */
    public List<Object> queryUserById(int id);

    /*
     * 修改
     * */
    public int updateUser(User user);

    /*
     * 查询所有
     * */
    public List<Object> queryAll();

    public List<Object> queryAll2();

    /*
     * 查询用户名与密码
     * */
    public HashMap<String,String> queryUserNP();
}
