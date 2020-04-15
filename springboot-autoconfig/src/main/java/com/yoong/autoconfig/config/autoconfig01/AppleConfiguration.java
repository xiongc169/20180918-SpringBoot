package com.yoong.autoconfig.config.autoconfig01;

import com.yoong.autoconfig.domain.fruit.Apple;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc Apple配置类
 * @Author
 * @Date
 * @Version 1.0
 */
//@Configuration
public class AppleConfiguration {

    public AppleConfiguration() {
        System.out.println("***************************************** AppleConfig() **************************************************");
    }

    @Bean
    @ConfigurationProperties(prefix = "domain.apple.app01")
    public Apple apple() {
        Apple apple = new Apple();
        return apple;
    }
}
