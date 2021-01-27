package com.yoong.maven.controller;

import com.chesheng.lock.redis.spring.boot.autoconfigure.lock.DistributedLock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Desc RedisLockController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/redisLock")
public class RedisLockController {

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    //#region SpringBoot自动注入
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;
    //#endregion


    //#region  XML配置手动注入
    @Autowired
    private Jedis jedis;

    @Autowired
    private JedisPool jedisPool;
    //#endregion

    @Autowired
    private DistributedLock csDistributeLock;

    /**
     * http://127.0.0.1:8000/redisLock/csDistLock?key=name
     */
    @Deprecated
    @ResponseBody
    @RequestMapping("/csDistLock")
    public void csDistLock(String key) {
        try {
            //jedis 3.3.0版本报错：java.lang.ClassNotFoundException: redis.clients.jedis.JedisCommands
            //降级为 jedis 2.9.0版本，其他地方报错，作废
            if (csDistributeLock.lock(key, 600l, 1)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                csDistributeLock.releaseLock(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8000/redisLock/firstDistLock?key=name
     */
    @ResponseBody
    @RequestMapping("/firstDistLock")
    public void firstDistLock(String key) {
        try {
            if (stringRedisTemplate.opsForValue().setIfAbsent(key, key, 5000, TimeUnit.MILLISECONDS)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                stringRedisTemplate.delete(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8000/redisLock/secondDistLock?key=name
     */
    @ResponseBody
    @RequestMapping("/secondDistLock")
    public void secondDistLock(String key) {
        try {
            if (jedisPool.getResource().setnx(key, key) > 0) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                jedisPool.getResource().del(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
