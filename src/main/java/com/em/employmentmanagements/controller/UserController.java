package com.em.employmentmanagements.controller;

import com.em.employmentmanagements.service.UserService;
import com.em.employmentmanagements.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 描述：
 *
 * @author PuYinsheng
 * @date 2020/4/24
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param userVo
     * @return
     */
    @GetMapping("/register")
    public int register(UserVo userVo){
        int a = userService.register(userVo);
        return a;
    }

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @GetMapping("/login")
    public int login(String username,String password){
        int a = userService.login(username,password);
        return a;
    }

}
