/*
 * Copyright (c) 2005-2019, EVECOM Technology Co.,Ltd. All rights reserved.
 *
 * EVECOM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.hzx.springbootmybatis.dao;

import com.hzx.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * description
 * created     2019/3/14 17:34
 *
 * @author Oli Hong
 * @version --添加版本信息
 * @see --添加类中引用的相关类和接口
 * @since Version 1.0
 */
@Mapper
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}
