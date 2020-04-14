package com.yoong.literature.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/report")
public class ReportController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8081/report/getReport
     */
    @ResponseBody
    @RequestMapping("/getReport")
    public String getReport() {
        String result = "Report: " + format.format(new Date());
        System.out.println(result);
        return result;
    }
}
