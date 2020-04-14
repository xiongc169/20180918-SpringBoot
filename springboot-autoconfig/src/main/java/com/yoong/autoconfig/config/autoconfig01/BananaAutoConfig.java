package com.yoong.autoconfig.config.autoconfig01;

import com.yoong.autoconfig.domain.fruit.Apple;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
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
@ConditionalOnBean(Apple.class)
public class BananaAutoConfig {

    public BananaAutoConfig() {
        System.out.println("***************************************** BananaAutoConfig() *****************************************");
    }

}
