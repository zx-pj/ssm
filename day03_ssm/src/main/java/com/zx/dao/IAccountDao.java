package com.zx.dao;

import com.zx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IAccountDao {
//    @Insert("insert into account (name,money) values(#{name},#{money})")
    void saveAccount(Account account);

//    @Select("select * from account")
    List<Account> findAll();
}
