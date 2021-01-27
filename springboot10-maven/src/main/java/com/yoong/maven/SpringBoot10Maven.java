package com.yoong.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SpringBoot10Maven
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@ImportResource("classpath*:redis-config.xml")
@SpringBootApplication
public class SpringBoot10Maven {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " SpringBoot10Maven Start...");
        SpringApplication.run(SpringBoot10Maven.class);
        System.out.println(sdFormat.format(new Date()) + " SpringBoot10Maven Finished");
    }
}
