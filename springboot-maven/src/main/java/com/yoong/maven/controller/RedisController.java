package com.yoong.maven.controller;

import com.yoong.maven.dao.RedisUtils;
import com.yoong.maven.distLock.DistributeLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisUtils redisUtils;

    @Autowired
    private DistributeLock distributeLock;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8080/redis/getRedis?key=name
     */
    @ResponseBody
    @RequestMapping("/getRedis")
    public String getRedis(String key) {
        try {
            String result = redisUtils.getValue(key);
            System.out.println(result);

            String value = format.format(new Date());
            redisUtils.setKey(key, value);
            String result02 = redisUtils.getValue(key);
            System.out.println(result02);

            redisUtils.deleteKey(key);
            String result03 = redisUtils.getValue(key);
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query failure";
    }

    /**
     * http://127.0.0.1:8080/redis/getRedis02?key=name
     */
    @ResponseBody
    @RequestMapping("/getRedis02")
    public String getRedis02(String key) {
        try {
            String result = redisUtils.getValue01(key);
            System.out.println(result);

            String value = format.format(new Date());
            redisUtils.setKey01(key, value, 1000000l);
            String result02 = redisUtils.getValue01(key);
            System.out.println(result02);

            redisUtils.deleteKey(key);
            String result03 = redisUtils.getValue01(key);
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query2 failure";
    }

    /**
     * http://127.0.0.1:8080/redis/getRedis2?key=name
     */
    @ResponseBody
    @RequestMapping("/distLock")
    public void distLock(String key) {
        try {
            if (distributeLock.lock(key, key, 1000l, 1)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(2000);
                distributeLock.releaseLock(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
