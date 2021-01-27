package com.yoong.autoconfig.controller;

import com.yoong.autoconfig.domain.Person;
import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.domain.fruit.Banana;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc 自动配置控制器
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:00:00
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/autoConfig")
public class AutoConfigController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired(required = false)
    private Apple apple;

    @Autowired(required = false)
    private Banana banana;

    @Autowired
    private Person person;

    /**
     * http://127.0.0.1:8051/autoConfig/getConfigProperty
     */
    @ResponseBody
    @RequestMapping("/getConfigProperty")
    public String getConfigProperty() {
        if (apple != null) {
            System.out.println("Apple: " + apple.getAppId() + " " + apple.getAppName());
        }

        //输出：default-banId default-banName
        Banana properties = new Banana();
        System.out.println("Banana: " + properties.getBanId() + " " + properties.getBanName());

        //输出：ban01-Id ban01-Name
        if (banana != null) {
            System.out.println("Banana02: " + banana.getBanId() + " " + banana.getBanName());
        }

        if (person != null) {
            System.out.println("Person: " + person.getLastName() + " " + person.getAge());
        }

        return format.format(new Date());
    }
}
