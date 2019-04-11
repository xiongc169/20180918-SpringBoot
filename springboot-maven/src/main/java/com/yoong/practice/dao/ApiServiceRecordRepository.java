package com.yoong.practice.dao;

import com.yoong.practice.domain.ApiServiceRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiServiceRecordRepository extends JpaRepository<ApiServiceRecord, Long> {
}
