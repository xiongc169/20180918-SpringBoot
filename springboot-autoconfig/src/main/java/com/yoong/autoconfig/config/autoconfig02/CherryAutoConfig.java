package com.yoong.autoconfig.config.autoconfig02;

import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.domain.fruit.Cherry;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(Apple.class)
public class CherryAutoConfig {

    public CherryAutoConfig() {
        System.out.println("***************************************** CherryAutoConfig() *****************************************");
    }

    @Bean
    public Cherry cherry() {
        System.out.println("************************************* CherryAutoConfig.cherry() **************************************************************");
        Cherry cherry = new Cherry();
        return cherry;
    }
}
