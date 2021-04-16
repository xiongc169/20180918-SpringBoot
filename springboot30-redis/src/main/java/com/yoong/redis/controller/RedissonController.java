package com.yoong.redis.controller;

import org.redisson.api.RBucket;
import org.redisson.api.RLock;
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
            redissonClient.getLock(key).lock();
            redissonClient.getLock(key).tryLock();
            redissonClient.getFairLock(key).lock();
            redissonClient.getFairLock(key).tryLock();

            RLock rLock01 = redissonClient.getLock("key1");
            RLock rLock02 = redissonClient.getLock("key2");
            RLock rLock03 = redissonClient.getLock("key3");
            redissonClient.getMultiLock(rLock01, rLock02, rLock03).lock();
            redissonClient.getRedLock(rLock01, rLock02, rLock03).lock();

            if (redissonClient.getFairLock(key).tryLock()) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                redissonClient.getLock(key).unlock();
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println("        " + format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8040/redisson/throughput?key=name
     */
    @ResponseBody
    @RequestMapping("/throughput")
    public void redisThroughput(String key) {
        try {
            RBucket<String> result01 = redissonClient.getBucket(key);
            System.out.println(format.format(new Date()) + "  " + result01.get());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
