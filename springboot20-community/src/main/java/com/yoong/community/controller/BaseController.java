package com.yoong.community.controller;

import com.yoong.community.core.domain.business.AttachmentInfo;
import com.yoong.community.core.service.business.AttachmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;

/**
 * @Desc BaseController
 * <p>
 * @Author yoong
 * <p>
 * @Date 2018-8-30
 * <p>
 * @Version 1.0
 */
@Controller
@RequestMapping("/base")
public class BaseController {

    private Logger logger = LoggerFactory.getLogger(DatasourceController.class);

    @Autowired
    private AttachmentService attachmentService;

    /**
     * http://127.0.0.1:8020/base/welcome
     */
    @RequestMapping("/welcome")
    public String welcome() {
        logger.debug("2018年9月30日10:28:48");
        System.out.println("enter welcome");
        return "welcome";
    }

    /**
     * http://127.0.0.1:8020/base/login
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
     * http://127.0.0.1:8020/base/add
     */
    @ResponseBody
    @RequestMapping("/add")
    public String add() {
        AttachmentInfo attachmentInfo = new AttachmentInfo();
        attachmentInfo.setFileName("git stash.png");
        attachmentInfo.setIsDelete(0);
        attachmentInfo.setModifyTime(new Timestamp(1611736681000l));
        attachmentInfo = attachmentService.addAttachment(attachmentInfo);
        return attachmentInfo.getId().toString();
    }
}
