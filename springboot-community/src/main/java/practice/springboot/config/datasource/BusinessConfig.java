package practice.springboot.config.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryBusiness", transactionManagerRef = "transactionManagerBusiness", basePackages = {"practice.springboot.domain.business"})
public class BusinessConfig {

    @Autowired
    @Qualifier("businessDataSource")
    private DataSource businessDataSource;

    @Bean(name = "entityManagerBusiness")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryBusiness(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryBusiness")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBusiness(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(businessDataSource)
                .properties(getVendorProperties(businessDataSource))
                .packages("practice.springboot.domain.business") //设置实体类所在位置
                .persistenceUnit("businessPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, Object> getVendorProperties(DataSource dataSource) {
        //return jpaProperties.getHibernateProperties(dataSource);
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }

    @Bean(name = "transactionManagerBusiness")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryBusiness(builder).getObject());
    }
}
