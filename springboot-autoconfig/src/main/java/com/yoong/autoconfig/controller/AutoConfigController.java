package com.yoong.autoconfig.controller;

import com.yoong.autoconfig.config.autoconfig01.BananaProperties;
import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.utils.SpringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自动配置控制器
 */
@Controller
@RequestMapping("autoConfig")
public class AutoConfigController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    //@Autowired
    //private Apple apple;

    //@Autowired
    //private BananaProperties bananaProperties;

    /**
     * http://127.0.0.1:8080/autoConfig/getConfig
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
