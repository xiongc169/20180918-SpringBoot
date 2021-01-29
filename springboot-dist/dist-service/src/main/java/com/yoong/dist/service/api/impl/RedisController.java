package com.yoong.dist.service.api.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc RedisController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
@Slf4j
@Controller
@RequestMapping("/redis")
public class RedisController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private RedisTemplate redisTemplate;


    /**
     * http://127.0.0.1:8090/redis/getRedis
     */
    @ResponseBody
    @RequestMapping("/getRedis")
    public String getRedis() {
        String time = sdFormat.format(new Date());
        return time;
    }
}

