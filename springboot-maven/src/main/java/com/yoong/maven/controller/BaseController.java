package com.yoong.maven.controller;

import com.yoong.maven.dao.DepartmentRepository;
import com.yoong.maven.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc BaseController
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private DepartmentRepository departmentRepository;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    /**
     * http://127.0.0.1:8080/base/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String time = format.format(new Date());
        System.out.println(time);
        return time;
    }

    /**
     * http://127.0.0.1:8080/base/saveDepartment
     */
    @ResponseBody
    @RequestMapping("/saveDepartment")
    public String saveDepartment() {
        try {
            Department record = new Department();
            record.setDeptName("Dept");
            record.setNote(format.format(new Date()));
            record = departmentRepository.save(record);
            //record instanceof Department
            //Department.class.isInstance(record)
            return String.valueOf(record.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "save failure";
    }
}
