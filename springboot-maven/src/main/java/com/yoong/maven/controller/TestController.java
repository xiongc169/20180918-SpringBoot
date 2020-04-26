package com.yoong.maven.controller;

import com.yoong.maven.dao.ApiServiceRecordRepository;
import com.yoong.maven.domain.ApiServiceRecord;
import org.springframework.beans.factory.annotation.Autowired;
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

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8080/test/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String time = format.format(new Date());
        System.out.println(time);
        return time;
    }

    /**
     * http://127.0.0.1:8080/test/saveServiceRecord
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
}
