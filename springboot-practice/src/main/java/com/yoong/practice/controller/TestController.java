package com.yoong.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc TestController
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * http://127.0.0.1:8110/test/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String msg = "abcd";
        return msg;
    }
}
