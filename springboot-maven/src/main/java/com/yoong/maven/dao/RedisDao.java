package com.yoong.maven.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Desc RedisDao
 * @Author
 * @Date
 * @Version 1.0
 */
@Component
public class RedisDao {

    @Autowired
    private StringRedisTemplate template;

    private Jedis jedis;

    public void setKey(String key, String value) {
        ValueOperations<String, String> ops = template.opsForValue();
        ops.set(key, value, 1, TimeUnit.MINUTES);
    }

    public String getValue(String key) {
        ValueOperations<String, String> ops = this.template.opsForValue();
        return ops.get(key);
    }

    public boolean setKey(String key, String value, Long timeOut) {
        try {
            RedisCallback<String> callback = (connection) -> {
                JedisCommands commands = (JedisCommands) connection.getNativeConnection();
                String uuid = UUID.randomUUID().toString();
                return commands.set(key, uuid, "NX", "PX", timeOut);
            };
            String result = template.execute(callback);
            return !StringUtils.isEmpty(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public Boolean deleteKey(String key) {
        Boolean result = template.delete(key);
        return result;
    }
}
