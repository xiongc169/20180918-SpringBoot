package com.yoong.autoconfig.config.autoconfig02;

import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.domain.fruit.Cherry;
import com.yoong.autoconfig.domain.fruit.DragonFruit;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
