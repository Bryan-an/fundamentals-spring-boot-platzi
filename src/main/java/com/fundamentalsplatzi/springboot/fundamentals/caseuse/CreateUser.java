package com.fundamentalsplatzi.springboot.fundamentals.caseuse;

import com.fundamentalsplatzi.springboot.fundamentals.entity.User;
import com.fundamentalsplatzi.springboot.fundamentals.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class CreateUser {
    private UserService userService;

    public CreateUser(UserService userService) {
        this.userService = userService;
    }

    public User save(User newUser) {
        return userService.save(newUser);
    }
}
