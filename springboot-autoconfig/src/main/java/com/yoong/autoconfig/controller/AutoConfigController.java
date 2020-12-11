package com.yoong.autoconfig.controller;

import com.yoong.autoconfig.config.autoconfig01.BananaProperties;
import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.utils.SpringUtils;
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


    /**
     * http://127.0.0.1:8050/autoConfig/getProperty
     */
    @ResponseBody
    @RequestMapping("/getProperty")
    public String getProperty() {
        //输出：default-banId default-banName
        BananaProperties properties = new BananaProperties();
        String result = properties.getBanId() + " " + properties.getBanName();
        System.out.println(result);

        //输出：ban01-Id ban01-Name
        String result02 = bananaProperties.getBanId() + " " + bananaProperties.getBanName();
        System.out.println(result02);
        return result;
    }

    /**
     * http://127.0.0.1:8050/autoConfig/getConfig
     */
    @ResponseBody
    @RequestMapping("/getConfig")
    public String getConfig() {
        String[] beanDefinitionNames = SpringUtils.applicationContext.getBeanDefinitionNames();
        for (String name : beanDefinitionNames) {
            System.out.println(name);
        }

        try {
            boolean hasApple = SpringUtils.applicationContext.containsBeanDefinition(Apple.class.getName());
            System.out.println(hasApple);
            Apple apple = SpringUtils.applicationContext.getBean(Apple.class);
            if (apple != null) {
                System.out.println(apple.getAppId());
            }
        } catch (Exception ex) {
            System.out.println("Exception-01: " + ex.getMessage());
        }

        try {
            boolean hasBanana = SpringUtils.applicationContext.containsBeanDefinition(BananaProperties.class.getName());
            System.out.println(hasBanana);
            BananaProperties bananaProperties = SpringUtils.applicationContext.getBean(BananaProperties.class);
            if (bananaProperties != null) {
                System.out.println(bananaProperties.getBanId());
            }
        } catch (Exception ex) {
            System.out.println("Exception-02: " + ex.getMessage());
        }
        String result = "AutoConfigController: " + format.format(new Date());
        System.out.println(result);
        return result;
    }
}
