package com.yoong.autoconfig.config.autoconfig01;

import com.yoong.autoconfig.config.MyImportSelector;
import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.domain.fruit.Banana;
import com.yoong.autoconfig.domain.fruit.DragonFruit;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Desc Banana自动配置类
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:00:00
 * <p>
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties(Banana.class)
//@ConditionalOnBean(Apple.class)
@ConditionalOnMissingBean(Apple.class)
//@ConditionalOnClass(DragonFruit.class)
//@ConditionalOnMissingClass("com.yoong.autoconfig.domain.fruit.DragonFruit")
//@ConditionalOnWebApplication
//@ConditionalOnNotWebApplication
public class BananaAutoConfiguration {

    public BananaAutoConfiguration(Banana banana) {
        System.out.println("********** BananaAutoConfiguration() **********");
        //输出：ban01-Id ban01-Name
        System.out.println(banana.getBanId() + " " + banana.getBanName());

        //若注释 @EnableConfigurationProperties(Banana.class) 注解，输出：default-banId default-banName
        //若启用 @EnableConfigurationProperties(Banana.class) 注解，输出：default-banId default-banName
        //若在 Controller 中直接用 @Autowired 注入 Banana，输出：ban01-Id ban01-Name。且Controller中注入的、方法入参中注入的 Banana对象是同一个。
        Banana newBanana = new Banana();
        System.out.println(newBanana.getBanId() + " " + newBanana.getBanName());
    }
}
