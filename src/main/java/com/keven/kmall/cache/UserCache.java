package com.keven.kmall.cache;

import com.keven.kmall.entity.User;

/**
 * Created by Keven on 2017/7/6.
 */
public interface UserCache {
    public User findUserByAccount(String account);

    public void save(User user);
}
