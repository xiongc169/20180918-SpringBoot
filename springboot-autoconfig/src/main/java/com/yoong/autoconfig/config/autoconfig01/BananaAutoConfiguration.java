package com.yoong.autoconfig.config.autoconfig01;

import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.domain.fruit.DragonFruit;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc Banana自动配置类
 * @Author
 * @Date
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

    public BananaAutoConfiguration() {
        System.out.println("***************************************** BananaAutoConfig() *****************************************");

        //若注释 @EnableConfigurationProperties(BananaProperties.class) 注解，输出：default-banId default-banName
        //若启用 @EnableConfigurationProperties(BananaProperties.class) 注解，输出：default-banId default-banName
        //若在 Controller 中用 @Autowired 注入 BananaProperties，输出：ban01-Id ban01-Name
        BananaProperties properties = new BananaProperties();
        System.out.println(properties.getBanId() + " " + properties.getBanName());
    }

}
