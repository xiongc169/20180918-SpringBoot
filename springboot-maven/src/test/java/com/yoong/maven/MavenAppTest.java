package com.yoong.maven;

import com.yoong.maven.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MavenAppTest {

    /**
     * Rigorous Test :-)
     */
    @Autowired
    private RedisUtils redisUtils;

    @Test
    public void redisTest() {
        String name = redisUtils.stringRedisTemplateGet("name");
        System.out.println(name);
        redisUtils.stringRedisTemplateSet("name", "yoong");
        String name2 = redisUtils.stringRedisTemplateGet("name");
        System.out.println(name2);
    }
}
