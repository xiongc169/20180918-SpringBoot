package com.yoong.accidence.controller;

import com.yoong.accidence.domain.wong.Customer;
import com.yoong.accidence.domain.wong.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ICustomerRepository customerRepository;

    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSSS");

    private SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMddHHmmssSSSS");

    /**
     * http://127.0.0.1:8081/test/getReport
     */
    @ResponseBody
    @RequestMapping("/getReport")
    public String getReport() {
        String result = "Report: " + format.format(new Date());
        System.out.println(result);
        return result;
    }

    /**
     * http://127.0.0.1:8081/test/addCustomer
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
        return customer;
    }

}
