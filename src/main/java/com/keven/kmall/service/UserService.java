package com.keven.kmall.service;

import com.keven.kmall.entity.User;

/**
 * Created by Keven on 2017/7/6.
 */
public interface UserService {

    public User findUserById(int id);

    public int save(User user) throws Exception;

    public User loginWithAccount(String account,String password);
}
