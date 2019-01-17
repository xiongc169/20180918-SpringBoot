package springboot.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springboot.community.domain.business.AttachmentInfo;
import springboot.community.service.business.AttachmentService;

@Controller
@RequestMapping("/attachment")
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    /**
     * http://127.0.0.1:8080/attachment/add
     * @return
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