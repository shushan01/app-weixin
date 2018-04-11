package com.app.controller;

import com.app.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.app.po.User;
import com.app.service.UserService;

import java.util.List;

/**
 * @Describle:
 * @Author: yangsongqing
 * @Date: 2017/11/28 13:51
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findByName", method = RequestMethod.GET)
    public List<User> findByName(String name) {
        return userService.findByName(name);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<User> findAll() {
        return userService.findAll();
    }

}
