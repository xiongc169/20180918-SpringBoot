package com.yoong.community.controller;

import com.yoong.community.domain.rehearsal.User;
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

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Spring Boot 使用NoSQL数据库 Redis
 * http://www.spring4all.com/article/254
 */
@Controller
@RequestMapping("/redis")
public class RedisController {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSSS");

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisTemplate<String, User> userRedisTemplate;

    //访问Actuator
    //http://127.0.0.1:8091/actuator/health

    /**
     * Redis测试：http://127.0.0.1:8021/redis/saveRedis
     */
    @ResponseBody
    @RequestMapping("/saveRedis")
    public String saveRedis() {
        try {
            //保存字符串
            String currentDate = dateFormat.format(new Date());
            stringRedisTemplate.opsForValue().set("name", currentDate);
            String name = stringRedisTemplate.opsForValue().get("name");
            System.out.println(name);
            //保存对象
            User superMan = new User("SuperMan", 100);
            User batMan = new User("BatMan", 50);
            userRedisTemplate.opsForValue().set(superMan.getName(), superMan);
            userRedisTemplate.opsForValue().set(batMan.getName(), batMan);
            //查看对象
            User superMan2 = userRedisTemplate.opsForValue().get(superMan.getName());
            System.out.println(superMan2.getAge());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Success";
    }

    /**
     * Redis测试：http://127.0.0.1:8021/redis/saveRedis2
     */
    @ResponseBody
    @RequestMapping("/saveRedis2")
    public String saveRedis2() {
        String key = "date";
        String value = dateFormat.format(new Date());
        Object result = redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                Boolean innerBool = redisConnection.set(serializer.serialize(key), serializer.serialize(value));
                return innerBool;
            }
        });
        System.out.println(result);

        Object result02 = redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                byte[] innerBytes = redisConnection.get(serializer.serialize(key));
                String innerString = serializer.deserialize(innerBytes);
                return innerString;
            }
        });
        System.out.println(result02);

        return result02.toString();
    }
}
