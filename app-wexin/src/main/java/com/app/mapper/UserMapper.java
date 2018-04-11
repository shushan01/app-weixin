package com.app.mapper;

import org.apache.ibatis.annotations.Param;
import com.app.config.SuperMapper;
import com.app.po.User;

import java.util.List;

/**
 * @Describle:
 * @Author: yangsongqing
 * @Date: 2017/11/28 13:42
 */
public interface UserMapper extends SuperMapper<User> {
    List<User> findByName(@Param("name") String name);
}
