package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.ResultVo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface UserService {
    //登录-
    ResultVo login(String name, String password, HttpSession session);
}
