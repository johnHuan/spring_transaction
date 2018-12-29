package com.zte.spring.dao;

import org.springframework.stereotype.Repository;

@Repository("accountDao")
public interface IAccountDao {
    // 转入
    void in(String username, double money);

    // 转出
    void out(String username, double money);
}
