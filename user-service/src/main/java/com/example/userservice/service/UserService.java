package com.example.userservice.service;

import com.example.userservice.dao.domain.UserDo;
import org.springframework.stereotype.Service;

public interface UserService {

    UserDo findById(Long id);
}
