package com.yoong.autoconfig.config.autoconfig03;

import com.yoong.autoconfig.domain.Person;
import com.yoong.autoconfig.domain.fruit.Apple;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Person.class)
//@ConditionalOnBean({Apple.class})
public class PersonAutoConfiguration {

    public PersonAutoConfiguration() {
        System.out.println("********** PersonAutoConfiguration() **********");
    }
}
