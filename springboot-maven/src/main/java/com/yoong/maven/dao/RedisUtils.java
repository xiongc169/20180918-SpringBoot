package com.yoong.maven.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands;
import redis.clients.jedis.JedisPool;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Desc RedisDao
 * @Author
 * @Date
 * @Version 1.0
 */
@Component
public class RedisUtils {

    /**
     * SpringBoot自动注入
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * XML配置手动注入
     */
    @Autowired
    private Jedis jedis;

    @Autowired
    private JedisPool jedisPool;

    public void setKey(String key, String value) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set(key, value, 1, TimeUnit.MINUTES);
    }

    public String getValue(String key) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        return ops.get(key);
    }

    public Boolean deleteKey(String key) {
        Boolean result = stringRedisTemplate.delete(key);
        return result;
    }

    public String getValue01(String key) {
        try {
            String result = (String) redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection connection) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = connection.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public boolean setKey01(String key, String value, Long timeOut) {
        try {
            RedisCallback<String> callback = (connection) -> {
                JedisCommands commands = (JedisCommands) connection.getNativeConnection();
                //String uuid = UUID.randomUUID().toString();
                return commands.set(key, value, "NX", "PX", timeOut);
            };
            String result = stringRedisTemplate.execute(callback);
            return !StringUtils.isEmpty(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean setKey02(String key, String value, Long timeOut) {
        try {
            //jedis.auth("admin");
            Long effectRows = jedisPool.getResource().setnx(key, value);
            return effectRows > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
