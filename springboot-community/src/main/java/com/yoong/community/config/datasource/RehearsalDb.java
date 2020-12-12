package com.yoong.community.config.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryRehearsal", transactionManagerRef = "transactionManagerRehearsal", basePackages = {"com.yoong.community.domain.rehearsal"})
public class RehearsalDb {

    @Autowired
    @Qualifier("rehearsalDataSource")
    private DataSource rehearsalDataSource;

    @Bean(name = "entityManagerTest")
    public EntityManager entityManagerRehearsal(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryRehearsal(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryRehearsal")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryRehearsal(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(rehearsalDataSource)
                .properties(getVendorProperties(rehearsalDataSource))
                .packages("com.yoong.community.domain.rehearsal") //设置实体类所在位置
                .persistenceUnit("rehearsalPersistenceUnit")
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

    @Bean(name = "transactionManagerRehearsal")
    PlatformTransactionManager transactionManagerRehearsal(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryRehearsal(builder).getObject());
    }
}
