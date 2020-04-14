package com.yoong.literature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 《SpringBoot实战》丁雪丰译
 * https://www.jb51.net/books/500699.html
 */
@SpringBootApplication
public class LiteratureApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("LiteratureApp Start...");
        SpringApplication.run(LiteratureApp.class, args);
        System.out.println("LiteratureApp Finished");
    }

}

