package com.code.service;

import com.code.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kinoz
 * @Date 2022/7/26 - 16:06
 * @apiNote
 */
@Service
//此注解用于开启事务
@Transactional(timeout = -1,propagation = Propagation.REQUIRED,isolation = Isolation.REPEATABLE_READ)
public class UserService {
    @Autowired
    private UserDao userDao;

    //转装
    public void transfer(){
        userDao.addMoney();
        userDao.reduceMoney();
        //模拟异常,触发事务操作
        //int i = 10/0;
    }
}

