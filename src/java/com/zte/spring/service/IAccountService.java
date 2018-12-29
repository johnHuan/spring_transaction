package com.zte.spring.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IAccountService {
    /**
     * 转账
     * @param usernameIn
     * @param usernameOut
     * @param money
     */
    void transfer(String usernameIn, String usernameOut, double money);
}
