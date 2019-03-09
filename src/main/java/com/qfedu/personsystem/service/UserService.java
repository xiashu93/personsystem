package com.qfedu.personsystem.service;

import com.qfedu.personsystem.common.vo.ResultVo;

public interface UserService {
    //登录-
    ResultVo login(String name, String password);
}
