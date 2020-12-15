package com.yoong.autoconfig.config.autoconfig03;

import com.yoong.autoconfig.domain.fruit.Banana;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//@Component
public class PersonProperties {

    @Bean
    @ConfigurationProperties("spring.person.name")
    public Banana banana(){
        Banana banana=new Banana();
        return banana;
    }
}
