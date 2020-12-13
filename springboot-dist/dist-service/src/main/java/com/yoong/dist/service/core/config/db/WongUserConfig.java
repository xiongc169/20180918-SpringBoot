package com.yoong.dist.service.core.config.db;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.yoong.dist.service.core.mapper.wong_user", sqlSessionFactoryRef = "wongUserSqlSessionFactory")
public class WongUserConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.wonguser")
    public DataSourceProperties wongUserDataSourceProperties() {
        DataSourceProperties wongUserDataSourceProperties = new DataSourceProperties();
        return wongUserDataSourceProperties;
    }

    @Bean
    //@ConfigurationProperties("spring.datasource.wongUser.configuration")
    public HikariDataSource wongUserDataSource() {
        return wongUserDataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Bean(name = "wongUserTransactionManager")
    public DataSourceTransactionManager wongUserTransactionManager(@Qualifier("wongUserDataSource") DataSource wongUserDataSource) {
        return new DataSourceTransactionManager(wongUserDataSource);
    }

    @Bean("wongUserSqlSessionFactory")
    public SqlSessionFactory wongUserSqlSessionFactory(@Qualifier("wongUserDataSource") HikariDataSource wongUserDataSource) throws Exception {
        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(wongUserDataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/wong_user/*.xml"));
        DefaultSqlSessionFactory sqlSessionFactory = (DefaultSqlSessionFactory) sessionFactoryBean.getObject();
        return sqlSessionFactory;
    }

    @Bean("wongUserSqlSessionTemplate")
    public SqlSessionTemplate wongUserSqlSessionTemplate(@Qualifier("wongUserSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }

    //@Bean("wongUserMapperScannerConfigurer")
    //public MapperScannerConfigurer wongUserMapperScannerConfigurer(@Qualifier("wongUserSqlSessionFactory") SqlSessionFactory wongUserSqlSessionFactory) throws Exception {
    //    MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
    //    scannerConfigurer.setSqlSessionFactory(wongUserSqlSessionFactory);
    //    scannerConfigurer.setBasePackage("com.yoong.dist.service.core.mapper.wong_user");
    //    return scannerConfigurer;
    //}
}
