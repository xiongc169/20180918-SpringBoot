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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryBusiness", transactionManagerRef = "transactionManagerBusiness", basePackages = {"com.yoong.community.domain.business"})//设置Repository所在位置
public class BusinessDb {

    @Autowired
    @Qualifier("businessDataSource")
    private DataSource businessDataSource;

    @Bean(name = "entityManagerBusiness")
    public EntityManager entityManagerBusiness(EntityManagerFactoryBuilder builder) {
        try {
            EntityManager entityManager = entityManagerFactoryBusiness(builder).getObject().createEntityManager();
            return entityManager;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    @Bean(name = "entityManagerFactoryBusiness")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBusiness(EntityManagerFactoryBuilder builder) {
        try {
            System.out.println("BusinessDb.entityManagerFactoryBusiness");
            LocalContainerEntityManagerFactoryBean bean = builder
                    .dataSource(businessDataSource)
                    .properties(getVendorProperties(businessDataSource))
                    .packages("com.yoong.community.domain.business")//设置实体类所在位置
                    .persistenceUnit("businessPersistenceUnit")
                    .build();
            return bean;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
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

    @Bean(name = "transactionManagerBusiness")
    PlatformTransactionManager transactionManagerBusiness(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryBusiness(builder).getObject());
    }
}
