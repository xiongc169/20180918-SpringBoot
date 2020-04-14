package com.yoong.accidence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SpringBoot入门
 */
@Controller
@EnableAutoConfiguration
@ComponentScan
//@SpringBootApplication
public class AccidenceApp {

    /**
     * 入口函数
     */
    public static void main(String[] args) {
        System.out.println("AccidenceApp Start...");
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AccidenceApp.class, args);
        System.out.println("AccidenceApp Finished");
    }

    /**
     * 启用AccidenceApp类的@Controller注解即可
     * http://127.0.0.1:8082/getApp
     */
    @ResponseBody
    @RequestMapping("/getApp")
    public String getApp() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");
        String result = "AccidenceApp: " + format.format(new Date());
        System.out.println(result);
        return result;
    }

}
