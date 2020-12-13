package com.yoong.dist.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc DistributeApp
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class DistributeApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " DistributeApp Start...");
        SpringApplication.run(DistributeApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " DistributeApp Finished");
    }
}
