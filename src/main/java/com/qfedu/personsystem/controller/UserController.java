package com.qfedu.personsystem.controller;

import com.qfedu.personsystem.common.sysconst.SystemCon;
import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.entity.User;
import com.qfedu.personsystem.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.Subject;
import javax.servlet.http.HttpSession;

@Api(value = "用户", tags = "用户相关操作")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    //登录
    @ApiOperation( "实现用户的登陆操作")
    @PostMapping("userlogin.do")
    public ResultVo login( String username,  String password, HttpSession session){
        ResultVo resultVo=userService.login(username,password,session);

        return resultVo;
    }

    //查询所有用户
    //参数类型不用@ApiParam，那么swagger中测即接口时是输入框的形式，加上@ApiParam，是json格式
    @ApiOperation(value = "全部用户",notes = "查询所有用户信息")
    @PostMapping("userlist.do")
    public PageVo<User> userByPage( int page,  int limit){
        return userService.queryPage(page,limit);

    }

    //与上面的解释类似，参数是对象的情况下，如果前面加注解requestbody，那么swagger中测即接口时是json形式
    //如果前面加注解不加requestbody，那么swagger中测即接口时是输入框形式
    @ApiOperation(value = "注册",notes = "用户注册")
    @PostMapping("userRegister.do")
    public ResultVo insert( User user){
        return   userService.insert(user);

    }





}
