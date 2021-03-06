package com.yoong.accidence.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Primary
    @Bean
    @Qualifier("wongSource")
    @ConfigurationProperties(prefix = "spring.datasource.wong")
    public DataSource wongSource() {
        //System.out.println("DataSourceConfig.wongSource");
        DataSource dataSource = DataSourceBuilder.create().build();
        return dataSource;
    }

    @Bean(name = "yoongSource")
    @Qualifier("yoongSource")
    @ConfigurationProperties(prefix = "spring.datasource.yoong")
    public DataSource yoongSource() {
        //System.out.println("DataSourceConfig.yoongSource");
        DataSource dataSource = DataSourceBuilder.create().build();
        return dataSource;
    }
}
