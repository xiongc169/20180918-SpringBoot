package com.yoong.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot入门系列
 * http://www.spring4all.com/article/246
 */
@SpringBootApplication
public class CommunityApp {

    private static Logger logger = LoggerFactory.getLogger(CommunityApp.class);

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("CommunityApp Start...");
        SpringApplication.run(CommunityApp.class, args);
        System.out.println("CommunityApp Finished");
        logger.info("CommunityApp Finished");
    }
}
