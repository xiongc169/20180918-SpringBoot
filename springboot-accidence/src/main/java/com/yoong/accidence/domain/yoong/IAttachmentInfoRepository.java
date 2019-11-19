package com.yoong.accidence.domain.yoong;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Desc AttachmentInfo
 * @Author
 * @Date
 * @Version 1.0
 */
@Repository
public interface IAttachmentInfoRepository extends JpaRepository<AttachmentInfo, Long> {


}
