package com.zx.test;

import com.zx.domain.Account;
import com.zx.service.IAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DaoTest {
    @Autowired
    private IAccountService accountService;

    @Test
    public void testFindAll(){
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
    }
    @Test public void testSave() {
        Account account = new Account();
        account.setName("龟仙人");
        account.setMoney(1234D);
        accountService.saveAccount(account);
    }
}
