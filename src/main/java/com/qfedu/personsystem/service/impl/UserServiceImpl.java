package com.qfedu.personsystem.service.impl;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.PageVo;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.dao.UserMapper;
import com.qfedu.personsystem.entity.User;
import com.qfedu.personsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;




    @Override
    public ResultVo login(String name, String password, HttpSession session) {
        User user=userMapper.selectByName(name);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return ResultUtil.exec(true,"OK",user);
            }
        }
        return ResultUtil.exec(false,"用户名或密码不正确",null);
    }

    @Override
    public PageVo<User> queryPage(int page, int limit) {
        return ResultUtil.exec(page,limit,userMapper.queryCount(),userMapper.queryByPage((page-1)*limit,limit));
    }
}
