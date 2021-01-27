package com.yoong.community.controller;

import com.yoong.community.core.domain.business.AttachmentInfo;
import com.yoong.community.core.domain.rehearsal.Department;
import com.yoong.community.core.domain.wong.Account;
import com.yoong.community.core.service.business.AttachmentService;
import com.yoong.community.core.service.rehearsal.DepartmentService;
import com.yoong.community.core.service.wong.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Desc Spring Boot 两种多数据源配置：JdbcTemplate、Spring-data-jpa
 * http://www.spring4all.com/article/253
 * http://blog.didispace.com/springbootmultidatasource/
 * https://www.jianshu.com/p/9f812e651319
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/datasource")
public class DatasourceController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private AttachmentService attachmentService;

    @Autowired
    private DepartmentService deptService;

    /**
     * http://127.0.0.1:8020/datasource/multiDataSource
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
            account = accountService.addAccount(account);
            System.out.println("AccountId: " + account.getId());
            //添加附件
            AttachmentInfo attachment = new AttachmentInfo();
            attachment.setFileName("git stash.png");
            attachment.setIsDelete(0);
            attachment.setModifyTime(new Timestamp(1611736681000l));
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
