package com.yoong.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * PracticeApp
 */
@SpringBootApplication
public class SpringBoot35Practice {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " PracticeApp Start...");
        SpringApplication.run(SpringBoot35Practice.class, args);
        System.out.println(sdFormat.format(new Date()) + " PracticeApp Finished");
    }
}