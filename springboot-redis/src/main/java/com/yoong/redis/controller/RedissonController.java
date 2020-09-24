package com.yoong.redis.controller;

import com.yoong.redis.domain.User;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc RedissonController
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("/redisson")
public class RedissonController {

    @Autowired
    private User user;

    //@Autowired
    //private RedisTemplate<Object, Object> redisTemplate1;

    //@Autowired
    //private RedisTemplate<String, Object> redisTemplate;

    //@Autowired
    //private RedisUtils redisUtils;

    @Autowired
    private RedissonClient redissonClient;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8040/redisson/myDistLock02?key=name
     */
    @ResponseBody
    @RequestMapping("/myDistLock02")
    public String myDistLock02(String key) {
        try {
            if (redissonClient.getLock(key).tryLock()) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                redissonClient.getLock(key).unlock();
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
                return Thread.currentThread().getId() + " 获取锁成功";
            } else {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return Thread.currentThread().getId() + " 获取锁失败";
    }
}
