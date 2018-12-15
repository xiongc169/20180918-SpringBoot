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
//    @ConfigurationProperties(prefix = "spring.datasource.rehearsal")
//    public DataSource testDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean(name = "yoongDataSource")
//    @Qualifier("yoongDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.business")
//    public DataSource yoongDataSource() {
//        return DataSourceBuilder.create().build();
//    }

    /**
     * DataSource的两种配置方法
     * https://blog.csdn.net/newhanzhe/article/details/80763581
     *
     * @return
     */
    @Bean(name = "wongDataSourceProperties")
    @Qualifier("wongDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.wong")
    public DataSourceProperties wongDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "wongDataSource")
    @Qualifier("wongDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.wong")
    public DataSource wongDataSource() {
        return wongDataSourceProperties().initializeDataSourceBuilder().build();
    }


    @Bean(name = "businessDataSourceProperties")
    @Qualifier("businessDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.business")
    public DataSourceProperties businessDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "businessDataSource")
    @Qualifier("businessDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.business")
    public DataSource businessDataSource() {
        return businessDataSourceProperties().initializeDataSourceBuilder().build();
    }


    @Primary
    @Bean(name = "rehearsalDataSourceProperties")
    @Qualifier("rehearsalDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.rehearsal")
    public DataSourceProperties rehearsalDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "rehearsalDataSource")
    @Qualifier("rehearsalDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.rehearsal")
    public DataSource rehearsalDataSource() {
        return rehearsalDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
