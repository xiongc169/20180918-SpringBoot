package com.yoong.autoconfig.config.autoconfig01;

import com.yoong.autoconfig.domain.fruit.Apple;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @Desc Apple配置类
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
//@Configuration
public class AppleConfiguration {

    public AppleConfiguration() {
        System.out.println("********** AppleConfiguration() **********");
    }

    @Bean
    @ConfigurationProperties(prefix = "domain.apple.app01")
    public Apple apple() {
        Apple apple = new Apple();
        return apple;
    }
}
