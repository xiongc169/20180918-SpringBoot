package com.yoong.literature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/report")
public class ReportController {

    @ResponseBody
    @RequestMapping("/getReport")
    public String getReport() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
        String result = "Report: " + format.format(new Date());
        System.out.println(result);
        return result;
    }
}
