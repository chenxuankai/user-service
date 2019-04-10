package com.example.userservice.service.impl;

import com.example.userservice.dao.domain.UserDo;
import com.example.userservice.service.UserService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service("userService")
public class UserServiceImpl implements UserService {


    @Override
    public UserDo findById(Long id) {
        UserDo userDo = new UserDo();
        userDo.setAge(11);
        userDo.setBalance(new BigDecimal(15));
        userDo.setId(1L);
        userDo.setName("陈旋凯");
        userDo.setUsername("失落者");
        return userDo;
    }
}
