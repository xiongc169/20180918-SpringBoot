package com.yoong.autoconfig.config.autoconfig01;

import com.yoong.autoconfig.domain.fruit.Apple;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc Banana自动配置类
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(BananaProperties.class)
//@ConditionalOnBean(Apple.class)
@ConditionalOnMissingBean(Apple.class)
//@ConditionalOnClass(DragonFruit.class)
//@ConditionalOnMissingClass("com.yoong.autoconfig.domain.fruit.DragonFruit")
//@ConditionalOnWebApplication
//@ConditionalOnNotWebApplication
public class BananaAutoConfiguration {

    public BananaAutoConfiguration(BananaProperties properties) {
        System.out.println("********** BananaAutoConfiguration() **********");
        //输出：ban01-Id ban01-Name
        System.out.println(properties.getBanId() + " " + properties.getBanName());

        //若注释 @EnableConfigurationProperties(BananaProperties.class) 注解，输出：default-banId default-banName
        //若启用 @EnableConfigurationProperties(BananaProperties.class) 注解，输出：default-banId default-banName
        //若在 Controller 中用 @Autowired 注入 BananaProperties，输出：ban01-Id ban01-Name
        BananaProperties newProperties = new BananaProperties();
        System.out.println(newProperties.getBanId() + " " + newProperties.getBanName());
    }
}
