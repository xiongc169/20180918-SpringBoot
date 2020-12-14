package com.yoong.dist.service.core.config.db_distribute;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.datasource.a1902stage")
public class A1902StageConfig {

    private String url;
    private String username;
    private String password;

}
