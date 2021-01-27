package com.yoong.redis.config;

import com.yoong.redis.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfigAnno {

    @Bean
    public User getUser() {
        User user = new User();
        user.setId("201906121630");
        user.setName("Hello");
        return user;
    }
}
