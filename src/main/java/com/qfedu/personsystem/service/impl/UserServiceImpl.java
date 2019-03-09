package com.qfedu.personsystem.service.impl;

import com.qfedu.personsystem.common.util.ResultUtil;
import com.qfedu.personsystem.common.vo.ResultVo;
import com.qfedu.personsystem.dao.UserMapper;
import com.qfedu.personsystem.entity.User;
import com.qfedu.personsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;



    @Override
    public ResultVo login(String name, String password) {
        User user=userMapper.selectByName(name);
        if(user!=null){
            if(user.getPassword().equals(password)){
                return ResultUtil.exec(true,"OK",user);
            }
        }
        return ResultUtil.exec(false,"用户名或密码不正确",null);
    }
}
