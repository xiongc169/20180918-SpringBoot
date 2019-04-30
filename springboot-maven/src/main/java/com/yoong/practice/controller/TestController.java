package com.yoong.practice.controller;

import com.yoong.practice.dao.ApiServiceRecordRepository;
import com.yoong.practice.dao.RedisDao;
import com.yoong.practice.domain.ApiServiceRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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
    private ApiServiceRecordRepository apiServiceRecordDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisDao redisDao;

    /**
     * http://127.0.0.1:8080/test/getTime
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");
        String time = format.format(new Date());
        System.out.println(time);
        return time;
    }

    /**
     * http://127.0.0.1:8080/test/saveServiceRecord
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveServiceRecord")
    public String saveServiceRecord() {
        try {
            ApiServiceRecord record = new ApiServiceRecord();
            record.setCreateDate(new Timestamp(new Date().getTime()));
            record.setRequestId(UUID.randomUUID().toString());
            record = apiServiceRecordDao.save(record);
            //record instanceof ApiServiceRecord
            //ApiServiceRecord.class.isInstance(record)
            return String.valueOf(record.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "save failure";
    }

    /**
     * http://127.0.0.1:8080/test/getRedis?key=name
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getRedis")
    public String getRedis(String key) {
        try {
            String result = redisDao.getValue(key);
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query failure";
    }

    /**
     * http://127.0.0.1:8080/test/setRedis?key=name&value=chaochaochao
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/setRedis")
    public String setRedis(String key, String value) {
        try {
            redisDao.setKey(key, value);
            return "save success";
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "save failure";
    }

    /**
     * http://127.0.0.1:8080/test/getRedis2?key=name
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getRedis2")
    public String saveRedis(String key) {
        try {
            String result = (String) redisTemplate.execute(new RedisCallback<String>() {
                @Override
                public String doInRedis(RedisConnection connection) throws DataAccessException {
                    RedisSerializer<String> serializer = redisTemplate.getStringSerializer();
                    byte[] value = connection.get(serializer.serialize(key));
                    return serializer.deserialize(value);
                }
            });
            return result;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "query2 failure";
    }
}
