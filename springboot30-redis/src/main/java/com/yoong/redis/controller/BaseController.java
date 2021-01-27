package com.yoong.redis.controller;

import com.yoong.redis.domain.User;
import com.yoong.redis.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;

/**
 * @Desc BaseController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private User user;

    /**
     * EMBED RedisTemplate
     */
    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    /**
     * DIY RedisTemplate
     */
    //@Autowired
    //private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8040/base/getUser
     */
    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser() {
        System.out.println(user.getId());
        return "Success " + user.getId();
    }

    /**
     * http://127.0.0.1:8040/base/getRedis
     */
    @ResponseBody
    @RequestMapping("/getRedis")
    public String getRedis() {
        //RedisAutoConfiguration
        boolean exist = redisTemplate.hasKey("name");
        System.out.println(exist);

        String name = redisUtils.get("name").toString();
        System.out.println(name);
        return "Success ";
    }
}
