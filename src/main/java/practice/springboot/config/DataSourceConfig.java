package practice.springboot.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
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

//    @Primary
//    @Bean(name = "testDataSource")
//    @Qualifier("testDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.test")
//    public DataSource testDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "yoongDataSource")
//    @Qualifier("yoongDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.yoong")
//    public DataSource yoongDataSource() {
//        return DataSourceBuilder.create().build();
//    }


    /**
     * DataSource的两种配置方法
     * https://blog.csdn.net/newhanzhe/article/details/80763581
     *
     * @return
     */
    @Primary
    @Bean(name = "testDataSourceProperties")
    @Qualifier("testDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.test")
    public DataSourceProperties testDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "testDataSource")
    @Qualifier("testDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.test")
    public DataSource test2DataSource() {
        return testDataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "yoongDataSourceProperties")
    @Qualifier("yoongDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.yoong")
    public DataSourceProperties yoongDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "yoongDataSource")
    @Qualifier("yoongDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.yoong")
    public DataSource yoong2DataSource() {
        return yoongDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
