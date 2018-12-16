package springboot.community.domain.business;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<AttachmentInfo, Long> {
}
