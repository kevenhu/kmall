package com.keven.test;

import com.keven.kmall.entity.User;
import com.keven.kmall.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Keven on 2017/7/5.
 */
public class TestUserDao extends BaseTest{


    @Autowired
    private UserService userService;

    @Test
    public void save() throws Exception{
        User user = new User();
        user.setAccount("1000");
        user.setUserName("张博伦");
        user.setPassword("1");
        userService.save(user);
    }

    @Test
    public void findUserById() {
        int id=1;
        User user = userService.findUserById(1);
        System.out.println("找到的user为"+user);
    }

    @Test
    public void loginWithAccount() {
        String account = "1000";
        String password="1";
        userService.loginWithAccount(account,password);
    }
}
