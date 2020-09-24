package com.yoong.accidence.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @Desc Spring Boot 两种多数据源配置：JdbcTemplate、Spring-data-jpa
 * http://www.spring4all.com/article/253
 * @Author
 * @Date
 * @Version 1.0
 */
@Configuration
public class TemplateConfig {

    @Bean(name = "wongTemplate")
    public JdbcTemplate wongTemplate(@Qualifier("wongSource") javax.sql.DataSource wongSource) {
        //System.out.println("DataSource.wongTemplate");
        JdbcTemplate template = new JdbcTemplate(wongSource);
        return template;
    }

    @Bean(name = "yoongTemplate")
    public JdbcTemplate yoongTemplate(@Qualifier("yoongSource") javax.sql.DataSource yoongSource) {
        //System.out.println("DataSource.yoongTemplate");
        JdbcTemplate template = new JdbcTemplate(yoongSource);
        return template;
    }
}
