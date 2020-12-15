package com.yoong.autoconfig.controller;

import com.yoong.autoconfig.config.autoconfig01.BananaProperties;
import com.yoong.autoconfig.domain.fruit.Apple;
import com.yoong.autoconfig.utils.MyApplicationContextAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc Actuator控制器
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-4-15 10:14:46
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/actuator")
public class ActuatorController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    // region 获取Spring容器
    @Autowired
    private ServletContext servletContext;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private MyApplicationContextAware myApplicationContextAware;

    //@Autowired
    //private SpringUtils.applicationContext applicationContext;
    // endregion 获取Spring容器

    /**
     * http://127.0.0.1:8051/actuator/getServletContext
     */
    @ResponseBody
    @RequestMapping("/getServletContext")
    public String getServletContext() {
        String[] beanDefinitionNames = webApplicationContext.getBeanDefinitionNames();
        System.out.println(beanDefinitionNames);
        try {
            boolean hasApple = webApplicationContext.containsBeanDefinition(Apple.class.getName());
            System.out.println(hasApple);
            Apple apple = webApplicationContext.getBean(Apple.class);
            if (apple != null) {
                System.out.println(apple.getAppId());
            }
            boolean hasBanana = webApplicationContext.containsBeanDefinition(BananaProperties.class.getName());
            System.out.println(hasBanana);
            BananaProperties bananaProperties = webApplicationContext.getBean(BananaProperties.class);
            if (bananaProperties != null) {
                System.out.println(bananaProperties.getBanId());
            }
        } catch (Exception ex) {
            System.out.println("Exception-02: " + ex.getMessage());
        }
        return format.format(new Date());
    }

    /**
     * 访问 http://127.0.0.1:8050/actuator，会返回所有端点的信息
     */
    @RequestMapping("/getEndPoint")
    public String getAllEndPoint() {
        return "actuator";
    }
}
