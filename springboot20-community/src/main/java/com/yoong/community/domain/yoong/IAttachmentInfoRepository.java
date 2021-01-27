package com.yoong.community.domain.yoong;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAttachmentInfoRepository extends JpaRepository<AttachmentInfo, Long> {

}
