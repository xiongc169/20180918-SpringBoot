package practice.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practice.springboot.domain.AttachmentInfo;
import practice.springboot.domain.AttachmentRepository;

@Service
public class AttachmentService {

//    @Autowired
//    private AttachmentRepository attachmentRepository;

    public Long addAttachment(AttachmentInfo attachmentInfo) {
//        attachmentRepository.save(attachmentInfo);
//        return attachmentInfo.getId();
        return  null;
    }
}
