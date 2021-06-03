package com.javacto.dao;

import com.javacto.util.BaseDao;
import com.javacto.po.Dog;
import java.util.List;

public class DogDaoImpl implements DogDao{

    @Override
    public int addDog(Dog dog) {
        String sql = "insert into Dog(id,dname,health,strain) values(?,?,?,?)";
        Object arr[] = {dog.getId(),dog.getdName(),dog.getHealth(),dog.getStrain()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int deleteDog(int id) {
        String sql = "delete from Dog where id=?";
        Object arr[] = {id};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public int updateDog(Dog dog) {
        String sql = "update Dog set strain=? where dname=?";
        Object arr[] = {"柯基",dog.getdName()};
        return BaseDao.myExecuteUpdate(sql,arr);
    }

    @Override
    public List<Object> queryDogById(int id) {
        String sql = "SELECT * FROM Dog WHERE id=?";
        return BaseDao.myExecuteQuery(sql,id);
    }

    @Override
    public List<Object> queryDogByName(String name) {
        String sql = "SELECT * FROM Dog WHERE dname=?";
        return BaseDao.myExecuteQuery(sql,name);
    }


    @Override
    public List<Object> queryAll() {
        String sql = "SELECT * FROM Dog";
        return BaseDao.myExecuteQuery(sql,null);
    }
}
