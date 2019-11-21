package com.yoong.accidence.config.properties;

import com.yoong.accidence.domain.fruit.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc 属性类
 * @Author
 * @Date
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(BananaProperties.class)
@ConditionalOnMissingBean(Apple.class)
//@ConditionalOnBean(Apple.class)
public class BananaAutoConfiguration {

    public BananaAutoConfiguration() {
        System.out.println("BananaAutoConfiguration()");
    }

    private BananaProperties bananaProperties;

}
