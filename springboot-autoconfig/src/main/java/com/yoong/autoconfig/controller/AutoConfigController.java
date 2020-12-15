package com.yoong.autoconfig.controller;

import com.yoong.autoconfig.config.autoconfig01.BananaProperties;
import com.yoong.autoconfig.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;

/**
 * @Desc 自动配置控制器
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/autoConfig")
public class AutoConfigController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    //@Autowired
    //private Apple apple;

    @Autowired
    private BananaProperties bananaProperties;

    @Autowired
    private Person person;

    /**
     * http://127.0.0.1:8051/autoConfig/getConfigProperty
     */
    @ResponseBody
    @RequestMapping("/getConfigProperty")
    public String getConfigProperty() {
        //输出：default-banId default-banName
        BananaProperties properties = new BananaProperties();
        String result = properties.getBanId() + " " + properties.getBanName();
        System.out.println(result);

        //输出：ban01-Id ban01-Name
        String result02 = bananaProperties.getBanId() + " " + bananaProperties.getBanName();
        System.out.println(result02);

        System.out.println(person.getLastName());
        return result;
    }
}
