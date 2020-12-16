package com.yoong.autoconfig.domain.fruit;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Desc Banana属性类
 * PS: @ConfigurationProperties 需要和 @EnableConfigurationProperties 或 @Component 关联使用
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
@Data
@ConfigurationProperties(prefix = "domain.banana.ban01")
//@PropertySource("classpath:application-dev.yml")
//@Component
public class Banana {
    private String banId = "default-banId";
    private String banName = "default-banName";
    private boolean eatable = false;

    public Banana() {
        System.out.println("********** Banana() **********");
    }
}


