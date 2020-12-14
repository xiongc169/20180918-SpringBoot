//package com.yoong.dist.service.core.config.db;
//
//import com.zaxxer.hikari.HikariDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.SqlSessionTemplate;
//import org.mybatis.spring.annotation.MapperScan;
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
//@MapperScan(basePackages = "com.yoong.dist.service.core.mapper.a1902_stage", sqlSessionFactoryRef = "a1902StageSqlSessionFactory")
//public class A1902StageConfig {
//
//    @Bean
//    @Primary
//    @ConfigurationProperties("spring.datasource.a1902stage")
//    public DataSourceProperties a1902StageDataSourceProperties() {
//        DataSourceProperties a1902StageDataSourceProperties = new DataSourceProperties();
//        return a1902StageDataSourceProperties;
//    }
//
//    @Bean
//    @Primary
//    //@ConfigurationProperties("spring.datasource.a1902Stage.configuration")
//    public HikariDataSource a1902StageDataSource(@Qualifier("a1902StageDataSourceProperties") DataSourceProperties a1902StageDataSourceProperties) {
//        HikariDataSource hikariDataSource = a1902StageDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
//        return hikariDataSource;
//    }
//
//    @Primary
//    @Bean(name = "a1902StageTransactionManager")
//    public DataSourceTransactionManager a1902StageTransactionManager(@Qualifier("a1902StageDataSource") DataSource a1902StageDataSource) {
//        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(a1902StageDataSource);
//        return transactionManager;
//    }
//
//    @Primary
//    @Bean("a1902StageSqlSessionFactory")
//    public SqlSessionFactory a1902StageSqlSessionFactory(@Qualifier("a1902StageDataSource") HikariDataSource a1902StageDataSource) throws Exception {
//        SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//        sessionFactoryBean.setDataSource(a1902StageDataSource);
//        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:mapper/a1902_stage/*.xml"));
//        DefaultSqlSessionFactory sqlSessionFactory = (DefaultSqlSessionFactory) sessionFactoryBean.getObject();
//        return sqlSessionFactory;
//    }
//
//    @Primary
//    @Bean("a1902StageSqlSessionTemplate")
//    public SqlSessionTemplate a1902StageSqlSessionTemplate(@Qualifier("a1902StageSqlSessionFactory") SqlSessionFactory sessionFactory) {
//        SqlSessionTemplate template = new SqlSessionTemplate(sessionFactory);
//        return template;
//    }
//
//}
