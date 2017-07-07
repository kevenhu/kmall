package com.keven.test;

import com.keven.kmall.cache.UserCache;
import com.keven.kmall.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

/**
 * Created by Keven on 2017/7/6.
 */

public class TestUserCache extends BaseTest{

    @Autowired
    private UserCache userCache;

    @Test
    public void save() {
        User user = new User();
        user.setAccount("12345");
        user.setUserName("王尼");
        user.setPassword("123");
        userCache.save(user);
    }

    @Test
    public void findByAccount() {
        String account = "12345";
        User user = userCache.findUserByAccount(account);
        assertNotNull(user);
        System.out.println("从redis获取的user是:"+user);
    }
}
