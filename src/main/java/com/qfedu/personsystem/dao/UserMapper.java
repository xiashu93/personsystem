package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    //添加一直无尽空间
    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}