package com.yoong.accidence.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Desc Spring Boot 两种多数据源配置：JdbcTemplate、Spring-data-jpa
 * http://www.spring4all.com/article/253
 * @Author
 * @Date
 * @Version 1.0
 */
@Configuration
public class DataSourceConfig {

    @Primary
    @Bean(name = "wongSource")
    @Qualifier("wongSource")
    @ConfigurationProperties(prefix = "spring.datasource.wong")
    public DataSource wongSource() {
        System.out.println("DataSourceConfig.wongSource");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "yoongSource")
    @Qualifier("yoongSource")
    @ConfigurationProperties(prefix = "spring.datasource.yoong")
    public DataSource yoongSource() {
        System.out.println("DataSourceConfig.yoongSource");
        return DataSourceBuilder.create().build();
    }
}
