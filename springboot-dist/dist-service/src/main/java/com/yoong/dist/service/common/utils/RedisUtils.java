package com.yoong.dist.service.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    public Object get(String key) {
        return this.redisTemplate.opsForValue().get(key);
    }

    public <T> void set(String key, Serializable value, long liveTime) {
        this.redisTemplate.opsForValue().set(key, value, liveTime, TimeUnit.SECONDS);
    }

    public void delete(String key) {
        this.redisTemplate.delete(key);
    }
}
