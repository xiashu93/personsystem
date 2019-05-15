package com.qfedu.personsystem.dao;

import com.qfedu.personsystem.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);


    //新增用户
    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    User selectByName(String name);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

//    查找所有ur
      @Select("select uid,username,password,flag,createtime from user order by uid asc limit #{index},#{count}")
      @ResultType(User.class)
      List<User> queryByPage(@Param("index") int index, @Param("count") int count);

    //查询数量
    @Select("select Count(*) from user")
    @ResultType(long.class)
    long queryCount();

}