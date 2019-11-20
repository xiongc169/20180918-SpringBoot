package com.yoong.accidence.controller;

import com.yoong.accidence.domain.wong.Customer;
import com.yoong.accidence.domain.wong.ICustomerRepository;
import com.yoong.accidence.domain.yoong.AttachmentInfo;
import com.yoong.accidence.domain.yoong.IAttachmentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SingleDataSourceController
 * @Author
 * @Date
 * @Version 1.0
 */
@Controller
@RequestMapping("/sDatasource")
public class SingleDataSourceController {

    @Autowired
    private ICustomerRepository customerRepository;

    @Autowired
    private IAttachmentInfoRepository attachmentInfoRepository;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    private SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMddHHmmssSSSS");

    /**
     * http://127.0.0.1:8080/sDatasource/getReport
     */
    @ResponseBody
    @RequestMapping("/getReport")
    public String getReport() {
        String result = "Report: " + format.format(new Date());
        System.out.println(result);
        return result;
    }

    /**
     * http://127.0.0.1:8080/sDatasource/addCustomer
     */
    @ResponseBody
    @RequestMapping("/addCustomer")
    public Customer addCustomer() {
        Customer customer = new Customer();
        String customerId = format2.format(new Date());
        customer.setCustomerId(customerId);
        customer.setCustomerName("Name-" + customerId);
        customer.setCreateTime(new Date());
        customerRepository.saveAndFlush(customer);
        System.out.println(customer.getId());

        AttachmentInfo attachmentInfo = new AttachmentInfo();
        attachmentInfoRepository.saveAndFlush(attachmentInfo);
        return customer;
    }

}
