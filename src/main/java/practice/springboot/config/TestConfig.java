package practice.springboot.config;

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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryTest", transactionManagerRef = "transactionManagerTest", basePackages = {"practice.springboot.domain.test"})
public class TestConfig {

    @Autowired
    @Qualifier("testDataSource")
    private DataSource testDataSource;

    @Primary
    @Bean(name = "entityManagerTest")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryTest(builder).getObject().createEntityManager();
    }

    @Primary
    @Bean(name = "entityManagerFactoryTest")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryTest(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(testDataSource)
                .properties(getVendorProperties(testDataSource))
                .packages("practice.springboot.domain.test") //设置实体类所在位置
                .persistenceUnit("testPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, Object> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }

    @Primary
    @Bean(name = "transactionManagerTest")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryTest(builder).getObject());
    }
}
