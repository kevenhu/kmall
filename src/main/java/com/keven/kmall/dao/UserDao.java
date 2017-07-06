package com.keven.kmall.dao;

import com.keven.kmall.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Keven on 2017/7/5.
 */
public interface UserDao {

    public User findUserById(int id);

    public int save(User user);

    public User loginWithAccount(@Param(value = "account") String account, @Param(value = "password") String password);

}
