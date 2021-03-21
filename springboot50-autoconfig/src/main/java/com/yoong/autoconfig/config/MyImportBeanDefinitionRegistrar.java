package com.yoong.autoconfig.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Desc Spring常用扩展点小记
 * 实践：配合 @Import(MyImportBeanDefinitionRegistrar.class) 使用
 * https://www.jianshu.com/p/1e212eac42ac
 * <p>
 * @Author yoong
 * <p>
 * @Date 2019年4月14日19:30:00
 * <p>
 * @Version 1.0
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, EnvironmentAware {

    private Environment environment;

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("MyImportBeanDefinitionRegistrar.registerBeanDefinitions");
        //registry.registerBeanDefinition("", null); //java.lang.IllegalArgumentException: BeanDefinition must not be null
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
