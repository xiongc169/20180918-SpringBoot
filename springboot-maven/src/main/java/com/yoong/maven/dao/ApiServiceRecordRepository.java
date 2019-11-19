package com.yoong.maven.dao;

import com.yoong.maven.domain.ApiServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiServiceRecordRepository extends JpaRepository<ApiServiceRecord, Long> {
}
