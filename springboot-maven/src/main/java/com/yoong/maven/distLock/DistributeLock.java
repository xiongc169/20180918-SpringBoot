package com.yoong.maven.distLock;

import com.yoong.maven.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * 分布式锁
 */
@Component
public class DistributeLock {

    @Autowired
    private RedisUtils redisUtils;

    private static Object object = new Object();

    //#region SpringBoot自动注入
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;
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
            if (StringUtils.isEmpty(redisUtils.stringRedisTemplateGet(key))) {
                redisUtils.jedisPoolSet(key, key, timeOut);
                return true;
            }
        }
        return false;
    }

    public Boolean releaseLock(String key) {
        Boolean result = redisUtils.stringRedisTemplateDel(key);
        return result;
    }

    public boolean lock2(String key, String value, Long timeOut, int retryTimes) {
        Boolean setResult = stringRedisTemplate.opsForValue().setIfAbsent(key, value, timeOut, TimeUnit.MILLISECONDS);
        return setResult;
    }

    public boolean releaseLock2(String key) {
        Boolean delResult = stringRedisTemplate.delete(key);
        return delResult;
    }
}
