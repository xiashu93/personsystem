package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface UserService {
    //登录-
    ResultVo login(String name, String password, HttpSession session);

    //查询分页
    PageVo<User> queryPage(int page, int limit);


}
