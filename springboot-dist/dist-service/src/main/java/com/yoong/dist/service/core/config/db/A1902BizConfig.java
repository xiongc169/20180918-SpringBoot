//package com.yoong.dist.service.core.config.db;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
//import org.mybatis.spring.mapper.MapperScannerConfigurer;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.core.io.support.ResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(basePackages = "com.yoong.dist.service.core.mapper.a1902_biz", sqlSessionFactoryRef = "a1902BizSqlSessionFactory")
//public class A1902BizConfig {
//
//    @Bean
//    @ConfigurationProperties("spring.datasource.a1902biz")
//    public DataSourceProperties a1902BizDataSourceProperties() {
//        DataSourceProperties a1902BizDataSourceProperties = new DataSourceProperties();
//        return a1902BizDataSourceProperties;
//    }
//
//    @Bean
//    //@ConfigurationProperties("spring.datasource.a1902biz.configuration")
//    public HikariDataSource a1902BizDataSource(@Qualifier("a1902BizDataSourceProperties") DataSourceProperties a1902BizDataSourceProperties) {
//        HikariDataSource hikariDataSource = a1902BizDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
//        return hikariDataSource;
//    }
//
//    @Bean(name = "a1902BizTransactionManager")
//    public DataSourceTransactionManager a1902BizTransactionManager(@Qualifier("a1902BizDataSource") DataSource a1902BizDataSource) {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(a1902BizDataSource);
//        return transactionManager;
//    }
//
//    @Bean("a1902BizSqlSessionFactory")
//    public SqlSessionFactory a1902BizSqlSessionFactory(@Qualifier("a1902BizDataSource") HikariDataSource a1902BizDataSource) throws Exception {
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(a1902BizDataSource);
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/a1902_biz/*.xml"));
//        DefaultSqlSessionFactory sqlSessionFactory = (DefaultSqlSessionFactory) sessionFactoryBean.getObject();
//        return sqlSessionFactory;
//    }
//
//    @Bean("a1902BizSqlSessionTemplate")
//    public SqlSessionTemplate a1902BizSqlSessionTemplate(@Qualifier("a1902BizSqlSessionFactory") SqlSessionFactory sessionFactory) {
//        SqlSessionTemplate template = new SqlSessionTemplate(sessionFactory);
//        return template;
//    }
//
//    //@Bean("a1902BizMapperScannerConfigurer")
//    //public MapperScannerConfigurer a1902BizMapperScannerConfigurer(@Qualifier("a1902BizSqlSessionFactory") SqlSessionFactory a1902BizSqlSessionFactory) throws Exception {
//    //    MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
//    //    //scannerConfigurer.setSqlSessionFactoryBeanName("a1902BizSqlSessionFactory");
//    //    scannerConfigurer.setSqlSessionFactory(a1902BizSqlSessionFactory);
//    //    scannerConfigurer.setBasePackage("com.yoong.dist.service.core.mapper.a1902_biz");
//    //    return scannerConfigurer;
//    //}
//}
