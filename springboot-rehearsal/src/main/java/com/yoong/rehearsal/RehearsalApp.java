package com.yoong.rehearsal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc RehearsalApp
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@SpringBootApplication
public class RehearsalApp {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " RehearsalApp Start...");
        SpringApplication.run(RehearsalApp.class);
        System.out.println(sdFormat.format(new Date()) + " RehearsalApp Finished");
    }
}
