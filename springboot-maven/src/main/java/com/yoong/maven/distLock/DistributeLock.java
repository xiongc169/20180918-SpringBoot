package com.yoong.maven.distLock;

import com.yoong.maven.dao.RedisDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public class DistributeLock {

    @Autowired
    private RedisDao redisDao;

    private static Object object = new Object();

    public boolean lock(String key, String value, Long timeOut, int retryTimes) {
        do {
            if (!StringUtils.isEmpty(redisDao.getValue(key))) {
                retryTimes--;
            } else {
                break;
            }
        } while (retryTimes >= 0);

//        synchronized (object) {
        if (StringUtils.isEmpty(redisDao.getValue(key))) {
            redisDao.setKey(key, value, timeOut);
            return true;
        }
//        }
        return false;
    }

    public Boolean releaseLock(String key) {
        Boolean result = redisDao.deleteKey(key);
        return result;
    }
}
