package com.yoong.autoconfig.config;

import com.yoong.autoconfig.config.autoconfig03.PersonAutoConfiguration;
import com.yoong.autoconfig.domain.Person;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//@Component
public class MyImportSelector implements DeferredImportSelector, BeanFactoryAware, ApplicationContextAware {

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        String[] beanDefinitions = ((DefaultListableBeanFactory) beanFactory).getBeanDefinitionNames();
        System.out.println(beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
        String[] beanDefinitions = applicationContext.getBeanDefinitionNames();
        System.out.println(applicationContext);
    }

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        importingClassMetadata.getAnnotationTypes().forEach(System.out::println);
        System.out.println(beanFactory);
        String[] className = new String[]{PersonAutoConfiguration.class.getName(), Person.class.getName()};
        return className;
    }
}