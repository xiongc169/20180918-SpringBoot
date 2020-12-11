package com.yoong.autoconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    /**
     * 访问 http://127.0.0.1:8050/actuator，会返回所有端点的信息
     */
    @RequestMapping("/getEndPoint")
    public String getAllEndPoint() {
        return "actuator";
    }
}
