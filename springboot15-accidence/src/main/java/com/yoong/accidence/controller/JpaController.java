package com.yoong.accidence.controller;

import com.yoong.accidence.core.wong.Customer;
import com.yoong.accidence.core.wong.ICustomerRepository;
import com.yoong.accidence.core.yoong.AttachmentInfo;
import com.yoong.accidence.core.yoong.IAttachmentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private IAttachmentInfoRepository attachmentInfoRepository;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    private SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMddHHmmssSSSS");

    /**
     * http://127.0.0.1:8011/jpa/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String time = "Time: " + format.format(new Date());
        System.out.println(time);
        return time;
    }

    /**
     * http://127.0.0.1:8011/jpa/insertMultiSource
     */
    @ResponseBody
    @RequestMapping("/insertMultiSource")
    public String insertMultiSource() {
        Customer customer = new Customer();
        String customerId = format2.format(new Date());
        customer.setCustomerId(customerId);
        customer.setCustomerName("Name-" + customerId);
        customer.setIsDelete(0);
        customerRepository.saveAndFlush(customer);
        System.out.println(customer.getId());

        AttachmentInfo attachmentInfo = new AttachmentInfo();
        //会向wong_user.attachment_info表中新增，抛出异常：Table 'wong_user.attachment_info' doesn't exist
        //PS：已解决，从库也加了@Primary注解导致的。
        attachmentInfoRepository.saveAndFlush(attachmentInfo);
        return null;
    }
}
