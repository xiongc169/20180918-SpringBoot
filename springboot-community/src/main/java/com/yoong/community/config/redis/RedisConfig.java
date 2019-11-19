package com.yoong.community.config.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import com.yoong.community.domain.rehearsal.User;

/**
 * Spring Boot 使用NoSQL数据库 Redis
 * http://www.spring4all.com/article/254
 */
@Configuration
public class RedisConfig {

    public RedisConfig() {
        System.out.println("*********************************************   RedisConfig   ***********************************************");
    }

    @Bean
    JedisConnectionFactory jedisConnectionFactory() {
        System.out.println("*********************************************   jedisConnectionFactory   *********************************************");
        return new JedisConnectionFactory();
    }

//    @Bean
//    public RedisTemplate<String, String> stringRedisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, String> template = new RedisTemplate<String, String>();
//        template.setConnectionFactory(jedisConnectionFactory());
//        template.setKeySerializer(new StringRedisSerializer());
//        template.setValueSerializer(new RedisObjectSerializer());
//        return template;
//    }

    @Bean
    public RedisTemplate<String, User> redisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, User> template = new RedisTemplate<String, User>();
        template.setConnectionFactory(jedisConnectionFactory());
        template.setKeySerializer(new StringRedisSerializer());
        template.setValueSerializer(new RedisObjectSerializer());
        return template;
    }
}
