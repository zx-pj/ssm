package com.zx.controller;

import com.zx.domain.Account;
import com.zx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
//路径中的/可以不写，习惯写上s
public class AccountController {
    @Autowired
    private IAccountService accountService;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户。。。。。。");
        List<Account> list = accountService.findAll();
        System.out.println(list);
        model.addAttribute("list",list);
        return "list";
    }

    /**
     * 保存
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("表现层：保存了账户。。。。。。");
        accountService.saveAccount(account);
        return "list";
    }
}
