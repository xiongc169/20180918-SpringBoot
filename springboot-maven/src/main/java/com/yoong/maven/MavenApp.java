package com.yoong.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * MavenApp
 */
@ImportResource("classpath*:redis-config.xml")
@SpringBootApplication
public class MavenApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " MavenApp Start...");
        SpringApplication.run(MavenApp.class);
        System.out.println(sdFormat.format(new Date()) + " MavenApp Finished");
    }
}
