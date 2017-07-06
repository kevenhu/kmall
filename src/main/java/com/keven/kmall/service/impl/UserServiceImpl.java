package com.keven.kmall.service.impl;

import com.keven.kmall.dao.UserDao;
import com.keven.kmall.entity.User;
import com.keven.kmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Keven on 2017/7/6.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public int save(User user) throws Exception{
        int result = userDao.save(user);
        if (result==1) {
            return 1;
        }else
            throw new Exception("注册失败");

    }

    public User loginWithAccount(String account, String password) {
        return userDao.loginWithAccount(account,password);
    }
}
