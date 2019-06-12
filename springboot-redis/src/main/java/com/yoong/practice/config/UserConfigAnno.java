package com.yoong.practice.config;

import com.yoong.practice.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc UserConfigAnno
 * @Author
 * @Date
 * @Version 1.0
 */
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
