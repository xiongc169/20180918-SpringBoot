package com.yoong.redis.config;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @Desc RedisConfig
 * https://www.cnblogs.com/zeng1994/p/03303c805731afc9aa9c60dbbd32a323.html
 * @Author
 * @Date
 * @Version 1.0
 */
@Configuration
//@ConditionalOnBean
public class RedisConfig {

//    @Bean
//    @SuppressWarnings("all")
//    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory factory) {
//        RedisTemplate<String, Object> template = new RedisTemplate<String, Object>();
//        template.setConnectionFactory(factory);
//
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
//        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//
//        StringRedisSerializer stringRedisSerializer = new StringRedisSerializer();
//
//        // key采用String的序列化方式
//        template.setKeySerializer(stringRedisSerializer);
//        // hash的key也采用String的序列化方式
//        template.setHashKeySerializer(stringRedisSerializer);
//        // value序列化方式采用jackson
//        template.setValueSerializer(stringRedisSerializer);
//        // hash的value序列化方式采用jackson
//        template.setHashValueSerializer(stringRedisSerializer);
//        template.afterPropertiesSet();
//        return template;
//    }

    @Bean
    public RedissonClient redisClient() {
        return Redisson.create();
    }
}
