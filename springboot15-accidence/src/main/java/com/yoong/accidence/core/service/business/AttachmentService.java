package com.yoong.accidence.core.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yoong.accidence.core.domain.business.AttachmentInfo;
import com.yoong.accidence.core.domain.business.AttachmentRepository;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    public AttachmentInfo addAttachment(AttachmentInfo attachmentInfo) {
        attachmentRepository.save(attachmentInfo);
        return attachmentInfo;
    }
}
