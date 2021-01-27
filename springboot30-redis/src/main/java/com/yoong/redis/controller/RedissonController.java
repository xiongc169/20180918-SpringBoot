package com.yoong.redis.controller;

import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc RedissonController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/redisson")
public class RedissonController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    private RedissonClient redissonClient;

    /**
     * http://127.0.0.1:8040/redisson/firstLock?key=name
     */
    @ResponseBody
    @RequestMapping("/firstLock")
    public void firstLock(String key) {
        try {
            if (redissonClient.getLock(key).tryLock()) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                redissonClient.getLock(key).unlock();
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
