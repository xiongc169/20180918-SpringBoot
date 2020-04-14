package com.yoong.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * PracticeApp
 */
@SpringBootApplication
public class PracticeApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("CommunityApp Start...");
        SpringApplication.run(PracticeApp.class, args);
        System.out.println("CommunityApp Finished");
    }
}
