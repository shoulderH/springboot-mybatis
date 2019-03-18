/*
 * Copyright (c) 2005-2019, EVECOM Technology Co.,Ltd. All rights reserved.
 *
 * EVECOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hzx.springbootmybatis.entity;

import java.io.Serializable;

/**
 * description
 * created     2019/2/20 10:12
 *
 * @author Oli Hong
 * @version --添加版本信息
 * @see --添加类中引用的相关类和接口
 * @since Version 1.0
 */
public class User implements Serializable{
    private Integer id;

    private String name;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}