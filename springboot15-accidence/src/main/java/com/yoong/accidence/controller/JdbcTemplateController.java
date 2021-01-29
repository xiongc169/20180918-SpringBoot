package com.yoong.accidence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Desc JdbcTemplateController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/jdbcTpl")
public class JdbcTemplateController {

    @Autowired
    @Qualifier("wongTemplate")
    private JdbcTemplate wongTemplate;

    @Autowired
    @Qualifier("yoongTemplate")
    private JdbcTemplate yoongTemplate;

    /**
     * http://127.0.0.1:8012/jdbcTpl/insertMultiSource
     */
    @ResponseBody
    @RequestMapping("/insertMultiSource")
    @Transactional
    public void insertMultiSource() {
        try {
            String addAccount = "INSERT INTO `account` (`account_id`, `password`, `contact_name`, `mobile`, `phone`, `email`, `customer_id`, `customer_no`, `customer_name`, `create_time`, `modify_time`, `note1`, `note2`, `is_delete`) " +
                    "VALUES ('111111111', 'password', 'name', 'mobile', NULL, NULL, NULL, NULL, NULL, NOW(), NOW(), NULL, NULL, '0');";
            String deleteAccount = "delete from account";
            String addAttachment = "INSERT INTO `attachment_info` ( `attachment_type`, `business_object_id`, `file_name`, `storage_path`, `is_delete`, `create_time`, `modify_time`) " +
                    "VALUES ('1', '1', '1', '1', '0', NOW(), NOW());";
            String deleteAttachment = "delete from attachment_info";

            wongTemplate.execute(addAccount);
            //int result = 100 / 0;
            yoongTemplate.execute(addAttachment);
        } catch (Exception ex) {
            ex.printStackTrace();
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }
    }
}
