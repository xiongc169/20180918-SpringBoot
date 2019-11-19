package com.yoong.community.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoong.community.domain.business.AttachmentInfo;
import com.yoong.community.domain.business.AttachmentRepository;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    public AttachmentInfo addAttachment(AttachmentInfo attachmentInfo) {
        attachmentRepository.save(attachmentInfo);
        return attachmentInfo;
    }
}
