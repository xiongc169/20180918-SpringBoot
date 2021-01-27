package com.yoong.community.controller;

import com.yoong.community.domain.wong.Customer;
import com.yoong.community.domain.wong.ICustomerRepository;
import com.yoong.community.domain.yoong.AttachmentInfo;
import com.yoong.community.domain.yoong.IAttachmentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc SingleDataSourceController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
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
     * http://127.0.0.1:8012/sDatasource/getTime
     */
    @ResponseBody
    @RequestMapping("/getTime")
    public String getTime() {
        String time = "Time: " + format.format(new Date());
        System.out.println(time);
        return time;
    }

    /**
     * http://127.0.0.1:8012/sDatasource/addCustomer
     */
    @ResponseBody
    @RequestMapping("/addCustomer")
    public String addCustomer() {
        Customer customer = new Customer();
        String customerId = format2.format(new Date());
        customer.setCustomerId(customerId);
        customer.setCustomerName("Name-" + customerId);
        customer.setIsDelete(0);
        customerRepository.saveAndFlush(customer);
        System.out.println(customer.getId());

        AttachmentInfo attachmentInfo = new AttachmentInfo();
        //会向wong_user.attachment_info表中新增，抛出异常：Table 'wong_user.attachment_info' doesn't exist
        attachmentInfoRepository.saveAndFlush(attachmentInfo);
        return null;
    }
}
