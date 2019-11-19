package com.yoong.accidence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc DataSourceController
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("/datasource")
public class DataSourceController {

    @Autowired
    @Qualifier("wongTemplate")
    private JdbcTemplate wongTemplate;

    @Autowired
    @Qualifier("yoongTemplate")
    private JdbcTemplate yoongTemplate;

    /**
     * http://127.0.0.1:8083/datasource/saveRecord
     */
    @ResponseBody
    @RequestMapping("/saveRecord")
    public void saveRecord() {
        try {
            wongTemplate.execute("delete from account");
            yoongTemplate.execute("delete from attachment_info");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
