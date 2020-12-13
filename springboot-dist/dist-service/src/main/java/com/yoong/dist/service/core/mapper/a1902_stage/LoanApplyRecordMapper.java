package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.LoanApplyRecord;
import com.yoong.dist.api.domain.a1902_stage.LoanApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanApplyRecordMapper {
    int countByExample(LoanApplyRecordExample example);

    int deleteByExample(LoanApplyRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanApplyRecord record);

    int insertSelective(LoanApplyRecord record);

    List<LoanApplyRecord> selectByExample(LoanApplyRecordExample example);

    LoanApplyRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanApplyRecord record, @Param("example") LoanApplyRecordExample example);

    int updateByExample(@Param("record") LoanApplyRecord record, @Param("example") LoanApplyRecordExample example);

    int updateByPrimaryKeySelective(LoanApplyRecord record);

    int updateByPrimaryKey(LoanApplyRecord record);
}