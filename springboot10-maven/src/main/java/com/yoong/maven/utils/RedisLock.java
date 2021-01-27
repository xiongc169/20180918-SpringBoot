package com.yoong.maven.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.util.concurrent.TimeUnit;

/**
 * @Desc DistributedLock
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Component
public class RedisLock {

    private static Object object = new Object();

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

    public boolean lock(String key, Long timeOut, int retryTimes) {
//        do {
//            if (!StringUtils.isEmpty(redisUtils.stringRedisTemplateGet(key))) {
//                retryTimes--;
//            } else {
//                break;
//            }
//        } while (retryTimes >= 0);

        synchronized (object) {
            if (StringUtils.isEmpty(stringRedisTemplate.opsForValue().get(key))) {
                //jedis.auth("admin");
                Long effectRows = jedisPool.getResource().setnx(key, key);
                return true;
            }
        }
        return false;
    }
}
