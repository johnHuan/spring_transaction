package com.zte.spring.service.impl;

import com.zte.spring.dao.IAccountDao;
import com.zte.spring.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    @Override
    public void transfer(String usernameIn, String usernameOut, double money) {


        // 转入
        accountDao.in(usernameIn, money);

        int i = 1/0;

        // 转出
        accountDao.out(usernameOut, money);



    }


    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
