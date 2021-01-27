package com.yoong.senior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SeniorApp
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@SpringBootApplication
public class SeniorApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SeniorApp Start...");
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(SeniorApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " SeniorApp Finished");
    }
}