package practice.springboot.service.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.springboot.domain.business.AttachmentInfo;
import practice.springboot.domain.business.AttachmentRepository;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    public AttachmentInfo addAttachment(AttachmentInfo attachmentInfo) {
        attachmentRepository.save(attachmentInfo);
        return attachmentInfo;
    }
}
