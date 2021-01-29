package com.yoong.dist.service.core.config.db_distributed;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.datasource.a1902stage")
public class A1902StageDataSourceConfig {

    private String url;
    private String username;
    private String password;

}
