package com.yoong.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SpringBoot入门系列
 * http://www.spring4all.com/article/246
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@SpringBootApplication
public class CommunityApp {

    private static Logger logger = LoggerFactory.getLogger(CommunityApp.class);

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println(sdFormat.format(new Date()) + " CommunityApp Start...");
        SpringApplication.run(CommunityApp.class, args);
        System.out.println(sdFormat.format(new Date()) + " CommunityApp Finished");
        logger.info("CommunityApp Finished");
    }
}
