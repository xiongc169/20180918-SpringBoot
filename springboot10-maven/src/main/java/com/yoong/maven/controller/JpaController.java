package com.yoong.maven.controller;

import com.yoong.maven.core.dao.DepartmentRepository;
import com.yoong.maven.core.domain.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Desc JpaController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/jpa")
public class JpaController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    @Autowired
    private DepartmentRepository departmentRepository;

    @Value("${spring.profiles.active}")
    private String env;

    /**
     * http://127.0.0.1:8000/jpa/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String time = format.format(new Date()) + "  " + env;
        logger.info(time);
        return time;
    }

    /**
     * http://127.0.0.1:8000/jpa/getDept
     */
    @ResponseBody
    @RequestMapping("/getDept")
    public void getDept() {
        List<Department> departments = departmentRepository.findAll();
        if (departments != null) {
            logger.info(format.format(new Date()) + "  " + departments.size());
        }
    }

    /**
     * http://127.0.0.1:8000/jpa/saveDepartment
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
