package com.yoong.maven.utils;

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

    public void stringRedisTemplateSet(String key, String value) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        Boolean setResult = ops.setIfAbsent(key, value, 10000l, TimeUnit.MILLISECONDS);
        ops.set(key, value, 1, TimeUnit.MINUTES);
    }

    public String stringRedisTemplateGet(String key) {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        return ops.get(key);
    }

    public Boolean stringRedisTemplateDel(String key) {
        Boolean result = stringRedisTemplate.delete(key);
        return result;
    }

    public boolean redisTemplateSet(String key, String value, Long timeOut) {
        try {
            Object result = redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection conn) throws DataAccessException {
                    JedisCommands commands = (JedisCommands) conn.getNativeConnection();
                    //String uuid = UUID.randomUUID().toString();
                    return commands.set(key, value, "NX", "PX", timeOut);
                }
            });
            return !StringUtils.isEmpty(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public String redisTemplateGet(String key) {
        try {
            String result = (String) redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection conn) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = conn.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public boolean jedisPoolSet(String key, String value, Long timeOut) {
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
