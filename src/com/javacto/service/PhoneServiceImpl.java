package com.javacto.service;

import com.javacto.dao.PhoneDao;
import com.javacto.dao.PhoneDaoImpl;
import com.javacto.po.Phone;

import java.util.List;

public class PhoneServiceImpl implements PhoneService{

    PhoneDao phoneDao = new PhoneDaoImpl();

    @Override
    public int addPhone(Phone phone) {
        return phoneDao.addPhone(phone);
    }

    @Override
    public int deletePhone(int id) {
        return phoneDao.deletePhone(id);
    }

    @Override
    public List<Object> queryPhoneById(int id) {
        return phoneDao.queryPhoneById(id);
    }

    @Override
    public List<Object> queryPhoneByName(String name) {
        return phoneDao.queryPhoneByName(name);
    }

    @Override
    public int updatephone(Phone phone) {
        return phoneDao.updatephone(phone);
    }

    @Override
    public List<Object> queryAll() {
        return phoneDao.queryAll();
    }
}
