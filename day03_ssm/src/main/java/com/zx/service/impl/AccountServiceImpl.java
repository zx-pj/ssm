package com.zx.service.impl;

import com.zx.dao.IAccountDao;
import com.zx.domain.Account;
import com.zx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层：查询所有账户");
        return accountDao.findAll();
    }
}
