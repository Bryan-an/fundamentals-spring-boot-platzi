package com.fundamentalsplatzi.springboot.fundamentals.configuration;

import com.fundamentalsplatzi.springboot.fundamentals.caseuse.GetUser;
import com.fundamentalsplatzi.springboot.fundamentals.caseuse.GetUserImplement;
import com.fundamentalsplatzi.springboot.fundamentals.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CaseUseConfiguration {
    
    @Bean
    GetUser getUser(UserService userService) {
        return new GetUserImplement(userService);
    }
}
