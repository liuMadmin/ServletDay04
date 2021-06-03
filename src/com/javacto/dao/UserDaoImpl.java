package com.javacto.dao;

import com.javacto.po.User;
import com.javacto.util.BaseDao;
import com.javacto.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDaoImpl implements UserDao{

    private Connection coon=null;
    private PreparedStatement pstmt=null;
    private ResultSet rs=null;

    @Override
    public int addUser(User user) {
        String sql = "INSERT INTO TUSER(t_name,t_password,t_sex,t_date,t_address,t_state) VALUES(?,?,?,NOW(),?,0)";
        Object arr[] = {user.getUserName(),user.getPwd(),user.getSex(),user.getAddress()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int deleteUser(int id) {
        String sql = "DELETE FROM TUSER WHERE t_id=?";
        Object arr[] = {id};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int updateUser(User user) {
        String sql = "UPDATE TUSER SET t_name=?,t_sex=? WHERE  t_id=?";
        Object arr[] = {user.getUserName(),user.getSex(),user.getId()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public List<Object> queryUserByID(int id) {
        String sql = "SELECT * FROM TUSER WHERE id=?";
        return BaseDao.myExecuteQuery(sql,id);
    }

    @Override
    public List<Object> queryAll() {
        String sql = "SELECT * FROM TUSER";
        return BaseDao.myExecuteQuery(sql,null);
    }

    @Override
    public HashMap<String,String> queryUserNP() {
        String sql = "SELECT t_name,t_password FROM TUSER";
        HashMap<String,String> hashMap = new HashMap<String,String>();

        try {
            coon = JDBCUtils.getDataSource().getConnection();
            pstmt = coon.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                hashMap.put(rs.getString(1),rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(coon,pstmt,rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return hashMap;
    }


    @Override
    public List<Object> queryAll2() {
        List<Object> list = new ArrayList<Object>();
        String sql = "SELECT * FROM TUSER";

        try {
            coon = JDBCUtils.getDataSource().getConnection();
            pstmt = coon.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()){
                HashMap<String,Object> hashMap = new HashMap<String,Object>();
                hashMap.put("id",rs.getInt(1));
                hashMap.put("name",rs.getString(2));
                hashMap.put("password",rs.getString(3));
                hashMap.put("sex",rs.getInt(4));
                hashMap.put("birthday",rs.getDate(5));
                hashMap.put("address",rs.getString(6));
                list.add(hashMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(coon,pstmt,rs);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return  list;
    }
}
