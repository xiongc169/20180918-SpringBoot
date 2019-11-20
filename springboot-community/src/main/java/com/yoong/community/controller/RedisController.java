package com.yoong.community.controller;

import com.yoong.community.domain.rehearsal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/redis")
public class RedisController {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSSS");

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, User> userRedisTemplate;

    /**
     * Redis测试：http://127.0.0.1:8091/redis/add2Redis
     */
    @ResponseBody
    @RequestMapping("/add2Redis")
    public String redis() {
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

    //访问Actuator
    //http://127.0.0.1:8090/actuator/health

}
