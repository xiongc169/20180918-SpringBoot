package com.yoong.maven.distLock;

import com.yoong.maven.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * 分布式锁
 */
@Component
public class DistributeLock {

    @Autowired
    private RedisUtils redisUtils;

    private static Object object = new Object();

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
}
