package com.example.userservice.web.controller;


import com.example.userservice.dao.domain.UserDo;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public UserDo findById(@PathVariable Long id) {
        return userService.findById(id);
    }


}
