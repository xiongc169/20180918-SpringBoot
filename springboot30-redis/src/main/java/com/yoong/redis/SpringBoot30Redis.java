package com.yoong.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SpringBoot30Redis
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@SpringBootApplication
public class SpringBoot30Redis {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringBoot30Redis Start...");
        SpringApplication.run(SpringBoot30Redis.class);
        System.out.println(sdFormat.format(new Date()) + " SpringBoot30Redis Finished");
    }
}
