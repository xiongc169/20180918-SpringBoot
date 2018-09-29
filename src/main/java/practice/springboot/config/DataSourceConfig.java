package practice.springboot.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

/**
 * 多数据源-数据库配置
 * http://www.spring4all.com/article/253
 */
@Configuration
public class DataSourceConfig {

    public DataSourceConfig() {
        System.out.println("**************************************************DataSourceConfig**************************************************");
    }

    @Bean(name = "testDataSource")
    @Qualifier("testDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.test")
    public DataSource mysqlDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "yoongDataSource")
    @Qualifier("yoongDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.yoong")
    public DataSource yoongDataSource() {
        return DataSourceBuilder.create().build();
    }

}
