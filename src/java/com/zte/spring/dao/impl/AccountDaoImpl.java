package com.zte.spring.dao.impl;

import com.zte.spring.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    @Autowired
    public void setSuperDataSource(DataSource dataSource){
        super.setDataSource(dataSource);
    }

    @Override
    public void in(String username, double money) {
        String sql = "update t_account set balance = balance - ? where username = ?";
        super.getJdbcTemplate().update(sql, money, username);
    }

    @Override
    public void out(String username, double money) {
        String sql = "update t_account set balance = balance + ? where username = ?";
        super.getJdbcTemplate().update(sql, money, username);
    }
}
