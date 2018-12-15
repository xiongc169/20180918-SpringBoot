package practice.springboot.config.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryRehearsal", transactionManagerRef = "transactionManagerRehearsal", basePackages = {"practice.springboot.domain.rehearsal"})
public class RehearsalConfig {

    @Autowired
    @Qualifier("rehearsalDataSource")
    private DataSource rehearsalDataSource;

    @Primary
    @Bean(name = "entityManagerTest")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryRehearsal(builder).getObject().createEntityManager();
    }

    @Primary
    @Bean(name = "entityManagerFactoryRehearsal")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryRehearsal(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(rehearsalDataSource)
                .properties(getVendorProperties(rehearsalDataSource))
                .packages("practice.springboot.domain.rehearsal") //设置实体类所在位置
                .persistenceUnit("rehearsalPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, Object> getVendorProperties(DataSource dataSource) {
        //return jpaProperties.getHibernateProperties(dataSource);
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }

    @Primary
    @Bean(name = "transactionManagerRehearsal")
    PlatformTransactionManager transactionManagerRehearsal(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryRehearsal(builder).getObject());
    }
}
