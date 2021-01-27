package com.yoong.accidence.config.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryWong", transactionManagerRef = "transactionManagerWong", basePackages = {"com.yoong.community.domain.wong"})
public class WongDb {

    @Autowired
    @Qualifier("wongDataSource")
    private DataSource wongDataSource;

    @Primary
    @Bean(name = "entityManagerWong")
    public EntityManager entityManagerWong(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryWong(builder).getObject().createEntityManager();
    }

    @Primary
    @Bean(name = "entityManagerFactoryWong")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryWong(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(wongDataSource)
                .properties(getVendorProperties(wongDataSource))
                .packages("com.yoong.community.domain.wong") //设置实体类所在位置
                .persistenceUnit("wongPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    @Autowired
    private HibernateProperties hibernateProperties;

    private Map<String, Object> getVendorProperties(DataSource dataSource) {
        //SpringBoot 1.5
        //return jpaProperties.getHibernateProperties(new HibernateSettings());
        //SpringBoot 2.0
        Map<String, Object> properties = hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
        return properties;
    }

    @Primary
    @Bean(name = "transactionManagerWong")
    PlatformTransactionManager transactionManagerWong(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryWong(builder).getObject());
    }
}