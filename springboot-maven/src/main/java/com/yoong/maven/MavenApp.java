package com.yoong.maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * MavenApp
 */
@SpringBootApplication
@ImportResource("classpath*:redis-config.xml")
public class MavenApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("MavenApp Start...");
        SpringApplication.run(MavenApp.class);
        System.out.println("MavenApp Finished");
    }
}
