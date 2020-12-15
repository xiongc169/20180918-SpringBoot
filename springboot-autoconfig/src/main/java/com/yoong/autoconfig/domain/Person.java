package com.yoong.autoconfig.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Desc springboot 配置文件以及自动配置
 * https://blog.csdn.net/try_try_try/article/details/80500211
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;//此处省略Dog类的bean实现，只有两个简单的属性{name:steven,age:2}
}
