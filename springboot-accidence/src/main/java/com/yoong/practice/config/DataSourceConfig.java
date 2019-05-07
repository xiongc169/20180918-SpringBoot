package com.yoong.practice.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Desc 配置多数据源一
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
        System.out.println("wongSource");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "yoongSource")
    @Qualifier("yoongSource")
    @ConfigurationProperties(prefix = "spring.datasource.yoong")
    public DataSource yoongSource() {
        System.out.println("yoongSource");
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "wongTemplate")
    public JdbcTemplate wongTemplate(@Qualifier("wongSource") DataSource wongSource) {
        System.out.println("wongTemplate");
        return new JdbcTemplate(wongSource);
    }

    @Bean(name = "yoongTemplate")
    public JdbcTemplate yoongTemplate(@Qualifier("yoongSource") DataSource yoongSource) {
        System.out.println("yoongTemplate");
        return new JdbcTemplate(yoongSource);
    }
}
