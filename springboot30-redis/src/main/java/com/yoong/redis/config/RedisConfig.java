package com.yoong.redis.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Desc RedisConfig
 * https://www.cnblogs.com/zeng1994/p/03303c805731afc9aa9c60dbbd32a323.html
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
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