package practice.springboot.config;

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
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryYoong", transactionManagerRef = "transactionManagerYoong", basePackages = {"practice.springboot.domain.yoong"})
public class YoongConfig {

    @Autowired
    @Qualifier("yoongDataSource")
    private DataSource yoongDataSource;

    @Bean(name = "entityManagerYoong")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryYoong(builder).getObject().createEntityManager();
    }

    @Bean(name = "entityManagerFactoryYoong")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryYoong(EntityManagerFactoryBuilder builder) {
        return builder
                .dataSource(yoongDataSource)
                .properties(getVendorProperties(yoongDataSource))
                .packages("practice.springboot.domain.yoong") //设置实体类所在位置
                .persistenceUnit("yoongPersistenceUnit")
                .build();
    }

    @Autowired
    private JpaProperties jpaProperties;

    private Map<String, Object> getVendorProperties(DataSource dataSource) {
//        return jpaProperties.getHibernateProperties(dataSource);
        return jpaProperties.getHibernateProperties(new HibernateSettings());
    }

    @Bean(name = "transactionManagerYoong")
    PlatformTransactionManager transactionManagerSecondary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryYoong(builder).getObject());
    }
}
