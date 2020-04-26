package com.yoong.autoconfig;

import com.yoong.autoconfig.utils.SpringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SpringBoot自动配置的实现原理
 * https://www.cnblogs.com/lfjjava/p/6096884.html
 * https://www.cnblogs.com/leihuazhe/p/7743479.html
 * <p/>
 * @Author yoong
 * <p/>
 * @Date 2019年4月14日19:30:00
 * <p/>
 * @Version 1.0
 */
@SpringBootApplication
public class AutoconfigApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " AutoconfigApp Start...");
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AutoconfigApp.class, args);
        SpringUtils.applicationContext = configurableApplicationContext;
        System.out.println(sdFormat.format(new Date()) + " AutoconfigApp Finished");
    }
}
