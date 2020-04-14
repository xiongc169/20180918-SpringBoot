package com.yoong.accidence.config;

import com.yoong.accidence.domain.fruit.Apple;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc AppleConfig
 * @Author
 * @Date
 * @Version 1.0
 */
@Configuration
public class AppleConfig {

    public AppleConfig() {
        System.out.println("AppleConfig");
    }

    @Bean
    @ConfigurationProperties(prefix = "domain.apple.app01")
    public Apple apple() {
        Apple apple = new Apple();
        return apple;
    }
}
