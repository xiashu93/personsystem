package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.sysconst.SystemCon;
import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.User;
import com.qfedu.personsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.Subject;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //登录
    @RequestMapping("userlogin.do")
    public ResultVo login(String username, String password,HttpSession session){
        ResultVo resultVo=userService.login(username,password,session);

        return resultVo;
    }


    @RequestMapping("userlist.do")
    public PageVo<User> goodspage(int page, int limit){
        return userService.queryPage(page,limit);

    }

    public ResultVo insert(User user){

        return null;
    }





}
