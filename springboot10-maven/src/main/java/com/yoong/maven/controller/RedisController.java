package com.yoong.maven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.commands.JedisCommands;
import redis.clients.jedis.params.SetParams;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Desc RedisController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

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

    /**
     * http://127.0.0.1:8000/redis/stringRedisTpl?key=name
     */
    @ResponseBody
    @RequestMapping("/stringRedisTpl")
    public String stringRedisTemplateDemo(String key) {
        try {
            String result = stringRedisTemplate.opsForValue().get(key);
            System.out.println(result);

            String value = format.format(new Date());
            stringRedisTemplate.opsForValue().set(key, value, 1, TimeUnit.MINUTES);
            String result02 = stringRedisTemplate.opsForValue().get(key);
            System.out.println(result02);

            stringRedisTemplate.delete(key);
            String result03 = stringRedisTemplate.opsForValue().get(key);
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query failure";
    }

    /**
     * http://127.0.0.1:8000/redis/redisTpl?key=name
     */
    @ResponseBody
    @RequestMapping("/redisTpl")
    public String redisTemplateDemo(String key) {
        try {
            String result = (String) redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection conn) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = conn.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            System.out.println(result);

            String value = format.format(new Date());
            redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection conn) throws DataAccessException {
                    JedisCommands commands = (JedisCommands) conn.getNativeConnection();
                    //String uuid = UUID.randomUUID().toString();
                    //return commands.set(key, value, "NX", "PX", timeOut);
                    return commands.set(key, value, SetParams.setParams());
                }
            });
            String result02 = (String) redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection conn) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = conn.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            System.out.println(result02);

            stringRedisTemplate.delete(key);
            String result03 = (String) redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection conn) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = conn.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query2 failure";
    }

    /**
     * http://127.0.0.1:8000/redis/jedisDemo?key=name
     */
    @ResponseBody
    @RequestMapping("/jedisDemo")
    public String jedisDemo(String key) {
        try {
            String result = jedisPool.getResource().get(key);
            System.out.println(result);

            String value = format.format(new Date());
            Long effectRows = jedisPool.getResource().setnx(key, value);
            String result02 = jedisPool.getResource().get(key);
            System.out.println(effectRows);
            System.out.println(result02);

            jedisPool.getResource().del(key);
            String result03 = jedisPool.getResource().get(key);
            System.out.println(result03);
            return result02;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query3 failure";
    }
}
