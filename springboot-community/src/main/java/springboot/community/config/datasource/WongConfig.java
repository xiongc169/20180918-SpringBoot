package springboot.community.config.datasource;

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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryWong", transactionManagerRef = "transactionManagerWong", basePackages = {"practice.springboot.domain.wong"})
public class WongConfig {

    @Autowired
    @Qualifier("wongDataSource")
    private DataSource wongDataSource;

    @Bean(name = "entityManagerWong")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryYoong(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryWong")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryYoong(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(wongDataSource)
                .properties(getVendorProperties(wongDataSource))
                .packages("practice.springboot.domain.wong") //设置实体类所在位置
                .persistenceUnit("wongPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, Object> getVendorProperties(DataSource dataSource) {
        //return jpaProperties.getHibernateProperties(dataSource);
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }

    @Bean(name = "transactionManagerWong")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryYoong(builder).getObject());
    }
}
