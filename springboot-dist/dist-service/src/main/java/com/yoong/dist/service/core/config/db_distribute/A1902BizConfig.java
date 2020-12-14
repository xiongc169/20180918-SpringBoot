package com.yoong.dist.service.core.config.db_distribute;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.datasource.a1902biz")
public class A1902BizConfig {

    private String url;
    private String username;
    private String password;

}
