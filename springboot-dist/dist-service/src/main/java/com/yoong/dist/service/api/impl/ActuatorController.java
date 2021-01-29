package com.yoong.dist.service.api.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

/**
 * @Desc ActuatorController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
@Slf4j
@Controller
@RequestMapping("/actuator")
public class ActuatorController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private ServletContext servletContext;

    /**
     * http://127.0.0.1:8090/actuator/getServletContext
     */
    @ResponseBody
    @RequestMapping("/getServletContext")
    public String getServletContext() {
        Enumeration<String> attributes = servletContext.getAttributeNames();
        String rootName = "org.springframework.web.context.WebApplicationContext.ROOT";
        WebApplicationContext rootContainer = (WebApplicationContext) servletContext.getAttribute(rootName);
        String[] rootBeans = rootContainer.getBeanDefinitionNames();

        String subName = "org.springframework.web.servlet.FrameworkServlet.CONTEXT.dispatcherServlet";
        WebApplicationContext subContainer = (WebApplicationContext) servletContext.getAttribute(subName);
        String[] subBeans = subContainer.getBeanDefinitionNames();

        String time = sdFormat.format(new Date());
        return time;
    }

    /**
     * http://127.0.0.1:8090/actuator/log
     */
    @ResponseBody
    @RequestMapping("/log")
    public String log(Long creditId) {
        log.info("applyCredit入参Id={}", creditId);
        log.warn("applyCredit入参Id WARN");
        log.error("applyCredit入参Id ERROOR");

        String time = sdFormat.format(new Date());
        return time;
    }
}
