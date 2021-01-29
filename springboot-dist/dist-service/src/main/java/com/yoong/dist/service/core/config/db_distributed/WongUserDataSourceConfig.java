package com.yoong.dist.service.core.config.db_distributed;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("spring.datasource.wonguser")
public class WongUserDataSourceConfig {

    private String url;
    private String username;
    private String password;

}
