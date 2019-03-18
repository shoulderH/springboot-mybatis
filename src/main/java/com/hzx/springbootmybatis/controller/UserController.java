/*
 * Copyright (c) 2005-2019, EVECOM Technology Co.,Ltd. All rights reserved.
 *
 * EVECOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hzx.springbootmybatis.controller;

import com.hzx.springbootmybatis.dao.UserMapper;
import com.hzx.springbootmybatis.entity.User;
import com.hzx.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * description
 * created     2019/2/20 11:50
 *
 * @author Oli Hong
 * @version --添加版本信息
 * @see --添加类中引用的相关类和接口
 * @since Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    UserMapper userMapper;
    @GetMapping(value = "/test")
    public  String test(){
        return "Test";
    }
    @GetMapping(value="/getUser")
    public List<Map<String,Object>> getUser(){
        String sql="select * from User";
        List<Map<String,Object>> list=jdbcTemplate.queryForList(sql);
        for (Map<String,Object> maps:list){
            Set<Map.Entry<String,Object>> set=maps.entrySet();
            Iterator<Map.Entry<String,Object>> iterator=set.iterator();
            while (iterator.hasNext()){
                Map.Entry<String,Object> map=iterator.next();
                System.out.println(map.getKey()+" "+map.getValue());
            }
        }
        return  list;
    }
    @RequestMapping(value = "/selectUserByName")
    public User selectUserByName(){
        User user=userMapper.selectUserByName("mary");
        return user;
    }
}
