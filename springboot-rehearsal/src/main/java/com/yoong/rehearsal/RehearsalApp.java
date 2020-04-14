package com.yoong.rehearsal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RehearsalApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("RehearsalApp Start...");
        SpringApplication.run(RehearsalApp.class, args);
        System.out.println("RehearsalApp Finished");
    }
}
