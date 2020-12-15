package com.yoong.autoconfig.config.autoconfig02;

import com.yoong.autoconfig.domain.fruit.Cherry;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc Cherry自动配置类
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
@Configuration
//@ConditionalOnBean(Apple.class)
//@ConditionalOnMissingBean(Apple.class)
//@ConditionalOnClass(DragonFruit.class)
@ConditionalOnMissingClass("com.yoong.autoconfig.domain.fruit.DragonFruit")
//@ConditionalOnWebApplication
//@ConditionalOnNotWebApplication
public class CherryAutoConfiguration {

    public CherryAutoConfiguration() {
        System.out.println("********** CherryAutoConfiguration() **********");
    }

    @Bean
    public Cherry cherry() {
        System.out.println("********** CherryAutoConfiguration.cherry() **********");
        Cherry cherry = new Cherry();
        return cherry;
    }
}
