package com.yoong.accidence.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class JdbcTemplateConfig {

    @Bean(name = "wongTemplate")
    public JdbcTemplate wongTemplate(@Qualifier("wongSource") javax.sql.DataSource wongSource) {
        //System.out.println("JdbcTemplateConfig.wongTemplate");
        JdbcTemplate template = new JdbcTemplate(wongSource);
        return template;
    }

    @Bean(name = "yoongTemplate")
    public JdbcTemplate yoongTemplate(@Qualifier("yoongSource") javax.sql.DataSource yoongSource) {
        //System.out.println("JdbcTemplateConfig.yoongTemplate");
        JdbcTemplate template = new JdbcTemplate(yoongSource);
        return template;
    }
}
