package com.yoong.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MavenApp
 */
@SpringBootApplication
public class MavenApp {

    /**
     * 入口函数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("MavenApp Start...");
        SpringApplication.run(MavenApp.class);
        System.out.println("MavenApp Finished");
    }
}
