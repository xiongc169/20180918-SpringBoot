package com.yoong.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yoong.community.domain.business.AttachmentInfo;
import com.yoong.community.service.business.AttachmentService;

@Controller
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    /**
     * http://127.0.0.1:8090/attachment/add
     */
    @ResponseBody
    @RequestMapping("/add")
    public String add() {
        AttachmentInfo attachmentInfo = new AttachmentInfo();
        attachmentInfo.setFileName("git stash.png");
        attachmentInfo = attachmentService.addAttachment(attachmentInfo);
        return attachmentInfo.getId().toString();
    }
}
