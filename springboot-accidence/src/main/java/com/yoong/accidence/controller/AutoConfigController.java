package com.yoong.accidence.controller;

import com.yoong.accidence.config.properties.BananaProperties;
import com.yoong.accidence.domain.fruit.Apple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SpringBoot自动配置的实现原理
 * https://www.cnblogs.com/lfjjava/p/6096884.html
 * https://www.cnblogs.com/leihuazhe/p/7743479.html
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("autoConfig")
public class AutoConfigController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    private Apple apple;

    @Autowired
    private BananaProperties bananaProperties;

    /**
     * http://127.0.0.1:8082/autoConfig/getConfig
     */
    @ResponseBody
    @RequestMapping("/getConfig")
    public String getConfig() {
        if (apple != null) {
            System.out.println(apple.getAppId());
        }
        if (bananaProperties != null) {
            System.out.println(bananaProperties.getBanId());
        }
        String result = "Report: " + format.format(new Date());
        System.out.println(result);
        return result;
    }
}
