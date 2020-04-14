package com.yoong.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("RedisApp Start...");
        SpringApplication.run(RedisApp.class, args);
        System.out.println("RedisApp Finished");
    }

}
