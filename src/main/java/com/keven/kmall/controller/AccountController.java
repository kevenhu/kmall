package com.keven.kmall.controller;

import com.keven.kmall.dao.UserDao;
import com.keven.kmall.entity.User;
import com.keven.kmall.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Keven on 2017/7/5.
 */

@Controller
public class AccountController {

    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginWithAccount(Model model,@RequestParam("account") String account,@RequestParam("password") String password) {
        logger.info("account:"+account+"request login");
        User user = userService.loginWithAccount(account,password);
        if (user==null){
            return "login failed";
        }else {
            String result = user.getUserName() + "login success";
            return result;
        }
    }


    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = "/register",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    public String register(Model model,User user) {
        try {
            userService.save(user);
            return user.getUserName()+"register success";
        }catch (Exception e) {
            logger.info(e.getMessage());
            return user.getUserName()+"register failed";
        }
    }
}
