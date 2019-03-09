package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.sysconst.SystemCon;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //登录
    @RequestMapping("userlogin.do")
    public ResultVo login(String username, String password){
        ResultVo resultVo=userService.login(username,password);


        return resultVo;
    }


}
