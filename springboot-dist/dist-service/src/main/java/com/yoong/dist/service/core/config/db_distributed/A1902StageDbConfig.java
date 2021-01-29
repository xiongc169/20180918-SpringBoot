package com.yoong.dist.service.core.config.db_distributed;

import com.mysql.cj.jdbc.MysqlXADataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@MapperScan(basePackages = "com.yoong.dist.service.core.mapper.a1902_stage", sqlSessionFactoryRef = "a1902StageSqlSessionFactory")
public class A1902StageDbConfig {

    // 配置数据源
    @Bean
    @Primary
    public DataSource a1902StageDataSource(A1902StageDataSourceConfig a1902StageDataSourceConfig) throws SQLException {
        MysqlXADataSource mysqlXaDataSource = new MysqlXADataSource();
        mysqlXaDataSource.setUrl(a1902StageDataSourceConfig.getUrl());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);
        mysqlXaDataSource.setPassword(a1902StageDataSourceConfig.getPassword());
        mysqlXaDataSource.setUser(a1902StageDataSourceConfig.getUsername());
        mysqlXaDataSource.setPinGlobalTxToPhysicalConnection(true);

        AtomikosDataSourceBean xaDataSource = new AtomikosDataSourceBean();
        xaDataSource.setXaDataSource(mysqlXaDataSource);
        xaDataSource.setUniqueResourceName("a1902StageDataSource");

//        xaDataSource.setMinPoolSize(testConfig.getMinPoolSize());
//        xaDataSource.setMaxPoolSize(testConfig.getMaxPoolSize());
//        xaDataSource.setMaxLifetime(testConfig.getMaxLifetime());
//        xaDataSource.setBorrowConnectionTimeout(testConfig.getBorrowConnectionTimeout());
//        xaDataSource.setLoginTimeout(testConfig.getLoginTimeout());
//        xaDataSource.setMaintenanceInterval(testConfig.getMaintenanceInterval());
//        xaDataSource.setMaxIdleTime(testConfig.getMaxIdleTime());
//        xaDataSource.setTestQuery(testConfig.getTestQuery());
        return xaDataSource;
    }

    @Bean(name = "a1902StageSqlSessionFactory")
    public SqlSessionFactory a1902StageSqlSessionFactory(@Qualifier("a1902StageDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath*:mapper/a1902_stage/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "a1902StageSqlSessionTemplate")
    public SqlSessionTemplate a1902StageSqlSessionTemplate(@Qualifier("a1902StageSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
