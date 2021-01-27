package com.yoong.redis.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "computer")
public class Computer {
    private String id;
    private String brand;
    private String serial;
    private String price;
}
