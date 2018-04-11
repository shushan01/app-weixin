package com.app.service;

import com.app.base.BaseService;
import com.app.mapper.UserMapper;
import com.app.po.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Describle:
 * @Author: yangsongqing
 * @Date: 2017/11/28 13:46
 */
@Service
public class UserService extends BaseService {
    @Autowired
    UserMapper userMapper;

    public List<User> findByName(String name) {
        log.info("分页查询user");
        PageHelper.startPage(1, 4);
        List<User> list = userMapper.findByName(name);
        return list;
    }

    public List<User> findAll() {
        return userMapper.selectAll();
    }
}
