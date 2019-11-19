package com.yoong.redis.controller;

import com.yoong.redis.domain.User;
import com.yoong.redis.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc TestController
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private User user;

//    @Autowired
//    private RedisTemplate<Object, Object> redisTemplate1;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    /**
     * http://127.0.0.1:8090/test/getUser
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getUser")
    public String getUser() {
        System.out.println(user.getId());
        return "Success " + user.getId();
    }

    /**
     * http://127.0.0.1:8090/test/getRedis
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getRedis")
    public String getRedis() {
        //RedisAutoConfiguration
        //boolean exist = redisTemplate.hasKey("name");
        //System.out.println(exist);

        String name = redisUtils.get("name").toString();
        System.out.println(name);

        return "Success ";
    }
}
