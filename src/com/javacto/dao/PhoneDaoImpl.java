package com.javacto.dao;

import com.javacto.util.BaseDao;
import com.javacto.util.JDBCUtils;
import com.javacto.po.Phone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhoneDaoImpl implements PhoneDao{

    Connection coon=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;

    @Override
    public int addPhone(Phone phone) {
        String sql = "insert into Phone(id,pname,color,money) values(?,?,?,?)";
        Object arr[] = {phone.getId(),phone.getpName(),phone.getColor(),phone.getMoney()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int deletePhone(int id) {
        String sql = "delete from Phone where id=?";
        Object arr[] = {id};
        return BaseDao.myExecuteUpdate(sql,arr);
    }


    @Override
    public int updatephone(Phone phone) {
        String sql = "update Phone set money=? where id=?";
        Object arr[] = {"10999",phone.getpName()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public List<Object> queryPhoneById(int id) {
        String sql = "SELECT * FROM Phone WHERE id=?";
        return BaseDao.myExecuteQuery(sql,id);
    }

    @Override
    public List<Object> queryPhoneByName(String name) {
        String sql = "SELECT * FROM Phone WHERE pname=?";
        return BaseDao.myExecuteQuery(sql,name);
    }

    @Override
    public List<Object> queryAll() {
        String sql = "SELECT * FROM Phone ";
        return BaseDao.myExecuteQuery(sql,null);
    }
}
