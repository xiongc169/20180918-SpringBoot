package com.yoong.maven.controller;

import com.chesheng.lock.redis.spring.boot.autoconfigure.lock.DistributedLock;
import com.yoong.maven.utils.RedisUtils;
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

    @Autowired
    private DistributedLock csDistributeLock;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8080/redis/stringRedisTpl?key=name
     */
    @ResponseBody
    @RequestMapping("/stringRedisTpl")
    public String stringRedisTemplateDemo(String key) {
        try {
            String result = redisUtils.stringRedisTemplateGet(key);
            System.out.println(result);

            String value = format.format(new Date());
            redisUtils.stringRedisTemplateSet(key, value);
            String result02 = redisUtils.stringRedisTemplateGet(key);
            System.out.println(result02);

            redisUtils.stringRedisTemplateDel(key);
            String result03 = redisUtils.stringRedisTemplateGet(key);
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query failure";
    }

    /**
     * http://127.0.0.1:8080/redis/redisTpl?key=name
     */
    @ResponseBody
    @RequestMapping("/redisTpl")
    public String redisTemplateDemo(String key) {
        try {
            String result = redisUtils.redisTemplateGet(key);
            System.out.println(result);

            String value = format.format(new Date());
            redisUtils.redisTemplateSet(key, value, 10000l);
            String result02 = redisUtils.redisTemplateGet(key);
            System.out.println(result02);

            redisUtils.stringRedisTemplateDel(key);
            String result03 = redisUtils.redisTemplateGet(key);
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query2 failure";
    }

    /**
     * http://127.0.0.1:8080/redis/jedisDemo?key=name
     */
    @ResponseBody
    @RequestMapping("/jedisDemo")
    public String jedisDemo(String key) {
        try {
            boolean setResult = redisUtils.jedisPoolSet(key, key, 10000l);
            System.out.println(setResult);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query3 failure";
    }

    /**
     * http://127.0.0.1:8080/redis/csDistLock?key=name
     */
    @ResponseBody
    @RequestMapping("/csDistLock")
    public void csDistLock(String key) {
        try {
            if (csDistributeLock.lock(key, 600l, 1)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                csDistributeLock.releaseLock(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                //System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8080/redis/myDistLock?key=name
     */
    @ResponseBody
    @RequestMapping("/myDistLock")
    public void myDistLock(String key) {
        try {
            if (distributeLock.lock(key, 1000l, 1)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(2000);
                distributeLock.releaseLock(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                //System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * http://127.0.0.1:8080/redis/myDistLock02?key=name
     */
    @ResponseBody
    @RequestMapping("/myDistLock02")
    public void myDistLock02(String key) {
        try {
            if (distributeLock.lock2(key, key, 600l, 1)) {
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取分布式锁 " + key);
                Thread.sleep(500);
                distributeLock.releaseLock2(key);
                System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 释放分布式锁 " + key);
            } else {
                //System.out.println(format.format(new Date()) + " " + Thread.currentThread().getId() + " 获取锁失败，退出 " + key);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
