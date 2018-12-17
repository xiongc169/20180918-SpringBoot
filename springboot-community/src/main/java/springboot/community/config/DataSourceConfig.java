package springboot.community.config;

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
 * SpringBoot配置多数据源两种方法(DataSourceBuilder、DataSourceProperties)
 * https://blog.csdn.net/newhanzhe/article/details/80763581
 * <p>
 * Spring Boot 两种多数据源配置：JdbcTemplate、Spring-data-jpa
 * http://www.spring4all.com/article/253
 */
@Configuration
public class DataSourceConfig {

    public DataSourceConfig() {
        System.out.println("**********************************************  DataSourceConfig  *******************************************");
    }

    // region spring.datasource.wong.jdbc-url

    /**
     * Spring Data JPA多数据源配置
     * https://www.jianshu.com/p/9f812e651319
     * 数据源一
     *
     * @return
     */
//    @Primary    //配置该数据源为主数据源
//    @Bean(name = "wongDataSource")
//    @Qualifier("wongDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.wong")     //配置文件中该数据源配置的前缀
//    public DataSource wongDataSource1() {
//        return DataSourceBuilder.create().build();
//    }
//
//    /**
//     * 数据源一
//     *
//     * @return
//     */
//    @Bean(name = "businessDataSource")
//    @Qualifier("businessDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.business")
//    public DataSource businessDataSource1() {
//        return DataSourceBuilder.create().build();
//    }
//
//    /**
//     * 数据源一
//     *
//     * @return
//     */
//    @Bean(name = "rehearsalDataSource")
//    @Qualifier("rehearsalDataSource")
//    @ConfigurationProperties(prefix = "spring.datasource.rehearsal")
//    public DataSource rehearsalDataSource1() {
//        return DataSourceBuilder.create().build();
//    }

    //endregion

    // region spring.datasource.wong.url

    /**
     * SpringBoot配置多数据源两种方法(DataSourceBuilder、DataSourceProperties)
     * https://blog.csdn.net/newhanzhe/article/details/80763581
     * 数据源一
     *
     * @return
     */
    @Primary    //配置该数据源为主数据源
    @Bean(name = "wongDataSourceProperties")
    @Qualifier("wongDataSourceProperties")
    @ConfigurationProperties(prefix = "spring.datasource.wong")     //配置文件中该数据源配置的前缀
    public DataSourceProperties wongDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "wongDataSource")
    @Qualifier("wongDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.wong")
    public DataSource wongDataSource() {
        return wongDataSourceProperties().initializeDataSourceBuilder().build();
    }


    /**
     * 数据源二
     *
     * @return
     */
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


    /**
     * 数据源三
     *
     * @return
     */
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

    //endregion

}
