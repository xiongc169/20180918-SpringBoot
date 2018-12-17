package com.yoong.practice.controller;

import com.yoong.practice.domain.Customer;
import com.yoong.practice.domain.ICustomerRepository;
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

    private SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

    /**
     * http://127.0.0.1:8080/test/getReport
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getReport")
    public String getReport() {
        String result = "Report: " + format.format(new Date());
        System.out.println(result);
        return result;
    }

    /**
     * http://127.0.0.1:8080/test/addCustomer
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/addCustomer")
    public Customer addCustomer() {
        Customer customer = new Customer();
        String customerId = format.format(new Date());
        customer.setCustomerId(customerId);
        customer.setCustomerName("Name" + customerId);
        customer.setCreateTime(new Date());
        customerRepository.saveAndFlush(customer);
        System.out.println(customer.getId());
        return customer;
    }

}
