package com.zx.service;

import com.zx.domain.Account;

import java.util.List;

public interface IAccountService {

    void saveAccount(Account account);
    List<Account> findAll();

}
