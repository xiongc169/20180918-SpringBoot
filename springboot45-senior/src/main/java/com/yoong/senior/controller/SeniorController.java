package com.yoong.senior.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;

@Controller
@RequestMapping("/senior")
public class SeniorController {

    private SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private ServletContext servletContext;

    /**
     * http://127.0.0.1:8070/senior/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        Enumeration<String> attributeNames = servletContext.getAttributeNames();
        System.out.println(attributeNames);

        String time = sdFormat.format(new Date());
        return time;
    }
}
