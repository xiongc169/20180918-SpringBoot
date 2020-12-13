package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.CreditRecord;
import com.yoong.dist.api.domain.a1902_stage.CreditRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CreditRecordMapper {
    int countByExample(CreditRecordExample example);

    int deleteByExample(CreditRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CreditRecord record);

    int insertSelective(CreditRecord record);

    List<CreditRecord> selectByExampleWithBLOBs(CreditRecordExample example);

    List<CreditRecord> selectByExample(CreditRecordExample example);

    CreditRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CreditRecord record, @Param("example") CreditRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") CreditRecord record, @Param("example") CreditRecordExample example);

    int updateByExample(@Param("record") CreditRecord record, @Param("example") CreditRecordExample example);

    int updateByPrimaryKeySelective(CreditRecord record);

    int updateByPrimaryKeyWithBLOBs(CreditRecord record);

    int updateByPrimaryKey(CreditRecord record);
}