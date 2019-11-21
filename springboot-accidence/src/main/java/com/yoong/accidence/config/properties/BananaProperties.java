package com.yoong.accidence.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Desc 属性类
 * PS: @ConfigurationProperties需要和@EnableConfigurationProperties 或 @Component关联使用
 * @Author
 * @Date
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "domain.banana.ban01")
@PropertySource("classpath:application-dev.yml")
//@Component
public class BananaProperties {

    public BananaProperties() {
        System.out.println("BananaProperties()");
    }

    private String banId = "default-banId";
    private String banName = "default-banName";
    private boolean eatable = false;
}
