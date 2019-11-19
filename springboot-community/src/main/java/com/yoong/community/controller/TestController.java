package com.yoong.community.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yoong.community.domain.business.AttachmentInfo;
import com.yoong.community.domain.rehearsal.Department;
import com.yoong.community.domain.rehearsal.User;
import com.yoong.community.domain.wong.Account;
import com.yoong.community.service.business.AttachmentService;
import com.yoong.community.service.rehearsal.DepartmentService;
import com.yoong.community.service.wong.AccountService;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AccountService accountService;

    @Autowired
    private AttachmentService attachmentService;

    @Autowired
    private DepartmentService deptService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<String, User> userRedisTemplate;

    /**
     * 页面测试：http://127.0.0.1:8080/test/welcome
     */
    @RequestMapping("/welcome")
    public String welcome() {
        logger.debug("2018年9月30日10:28:48");
        System.out.println("enter welcome");
        return "welcome";
    }

    /**
     * 传参测试：http://127.0.0.1:8080/test/login
     */
    @ResponseBody
    @RequestMapping("/login")
    public String login(String name, String password) {
        if (name != null && name.equals("sa") && password != null && password.equals("123456")) {
            return "Login Success";
        }
        return "Login Failure";
    }

    /**
     * 多数据源测试：http://127.0.0.1:8080/test/multiDataSource
     */
    @ResponseBody
    @RequestMapping("/multiDataSource")
    public void multiDataSource() {
        try {
            //添加子账号
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmssSSSS");
            Account account = new Account();
            account.setAccountId(dateFormat.format(new Date()));
            account.setContactName("子账号11");
            account.setCreateTime(new Date());
            account.setModifyTime(new Date());
            account.setIsDelete(0);
            accountService.addAccount(account);
            System.out.println("AccountId: " + account.getId());
            //添加附件
            AttachmentInfo attachment = new AttachmentInfo();
            attachment.setFileName("git stash.png");
            attachment = attachmentService.addAttachment(attachment);
            System.out.println("AttachmentId: " + attachment.getId());
            //添加部门
            Department department = new Department();
            department.setDeptName("部门11");
            department.setNote("Note 11");
            department = deptService.addDepartment(department);
            System.out.println("DepartmentId: " + department.getId());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
