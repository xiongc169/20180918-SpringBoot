package com.yoong.dist.service.api.impl;

import com.yoong.dist.api.domain.a1902_biz.CustomerCredit;
import com.yoong.dist.api.domain.a1902_stage.ApiSendRecord;
import com.yoong.dist.api.domain.wong_user.Account;
import com.yoong.dist.service.core.mapper.a1902_biz.CustomerCreditMapper;
import com.yoong.dist.service.core.mapper.a1902_stage.ApiSendRecordMapper;
import com.yoong.dist.service.core.mapper.wong_user.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc MyBatisController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2020-9-18
 * <p>
 * @Version 1.0
 */
@Slf4j
@Controller
@RequestMapping("/mybatis")
public class MyBatisController {

    private static SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private CustomerCreditMapper customerCreditMapper;

    @Autowired
    private ApiSendRecordMapper apiSendRecordMapper;

    @Autowired
    private AccountMapper accountMapper;

    /**
     * http://127.0.0.1:8090/mybatis/insert?orderNo=12345
     */
    @ResponseBody
    @RequestMapping("/insert")
    //@Transactional//仅 @Primary=a1902StageTransactionManager 注解的事务生效
    //@Transactional(transactionManager = "a1902StageTransactionManager")//仅 a1902StageTransactionManager 事务生效
    //@Transactional(transactionManager = "a1902BizTransactionManager")//仅 a1902BizTransactionManager 事务生效
    //@Transactional(transactionManager = "wongUserTransactionManager")//仅 wongUserTransactionManager 事务生效
    public String insert(String orderNo) {
        CustomerCredit customerCredit = new CustomerCredit();
        customerCredit.setAgencyOrgId(1111l);
        Integer insertCreditRows = customerCreditMapper.insert(customerCredit);
        System.out.println(insertCreditRows);

        ApiSendRecord sendRecord = new ApiSendRecord();
        sendRecord.setApiServiceId(1l);
        Integer insertSendRows = apiSendRecordMapper.insertSelective(sendRecord);
        System.out.println(insertSendRows);

        Account account = new Account();
        account.setAccountId(orderNo);
        Integer insertAccountRows = accountMapper.insertSelective(account);
        System.out.println(insertAccountRows);

        //int bb = 100 / 0;

        String time = sdFormat.format(new Date());
        return time;
    }

    /**
     * http://127.0.0.1:8090/mybatis/insertXaTx?orderNo=1000
     */
    @ResponseBody
    @RequestMapping("/insertXaTx")
    @Transactional//分布式事务
    public String insertXaTx(String orderNo) {
        CustomerCredit customerCredit = new CustomerCredit();
        customerCredit.setAgencyOrgId(1111l);
        Integer insertCreditRows = customerCreditMapper.insert(customerCredit);
        System.out.println(insertCreditRows);

        ApiSendRecord sendRecord = new ApiSendRecord();
        sendRecord.setApiServiceId(1l);
        Integer insertSendRows = apiSendRecordMapper.insertSelective(sendRecord);
        System.out.println(insertSendRows);

        Account account = new Account();
        account.setAccountId(orderNo);
        Integer insertAccountRows = accountMapper.insertSelective(account);
        System.out.println(insertAccountRows);

        //int bb = 100 / 0;

        String time = sdFormat.format(new Date());
        return time;
    }
}

