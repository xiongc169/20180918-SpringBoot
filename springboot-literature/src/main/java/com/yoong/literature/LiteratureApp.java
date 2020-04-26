package com.yoong.literature;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 《SpringBoot实战》丁雪丰译
 * https://www.jb51.net/books/500699.html
 */
@SpringBootApplication
public class LiteratureApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " LiteratureApp Start...");
        SpringApplication.run(LiteratureApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " LiteratureApp Finished");
    }
}

