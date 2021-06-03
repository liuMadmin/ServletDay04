package com.javacto.dao;

import com.javacto.util.BaseDao;
import com.javacto.po.Computer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class ComputerDaoImpl implements ComputerDao {

    Connection coon=null;
    PreparedStatement pstmt=null;
    ResultSet rs=null;

    @Override
    public int addComputer(Computer computer) {
        String sql = "insert into Computer(id,cname,color,money) values(?,?,?,?)";
        Object arr[] = {computer.getId(),computer.getcName(),computer.getColor(),computer.getMoney()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int deleteComputer(int id) {
        String sql = "delete from Computer where id=?";
        Object arr[] = {id};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int updateComputer(Computer computer) {
        String sql = "update Computer set money=? where cname=?";
        Object arr[] = {"8999",computer.getcName()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public List<Object> queryComputerById(int id) {
        String sql = "SELECT * FROM Computer WHERE id=?";
        return BaseDao.myExecuteQuery(sql,id);
    }

    @Override
    public List<Object> queryComputerByName(String name) {
        String sql = "SELECT * FROM Computer WHERE cname=?";
        return BaseDao.myExecuteQuery(sql,name);
    }

    @Override
    public List<Object> queryAll() {
        String sql = "SELECT * FROM Computer ";
        return BaseDao.myExecuteQuery(sql,null);
    }
}
