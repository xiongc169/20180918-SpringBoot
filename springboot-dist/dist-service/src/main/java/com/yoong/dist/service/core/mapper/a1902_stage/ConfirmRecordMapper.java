package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.ConfirmRecord;
import com.yoong.dist.api.domain.a1902_stage.ConfirmRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConfirmRecordMapper {
    int countByExample(ConfirmRecordExample example);

    int deleteByExample(ConfirmRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfirmRecord record);

    int insertSelective(ConfirmRecord record);

    List<ConfirmRecord> selectByExampleWithBLOBs(ConfirmRecordExample example);

    List<ConfirmRecord> selectByExample(ConfirmRecordExample example);

    ConfirmRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfirmRecord record, @Param("example") ConfirmRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ConfirmRecord record, @Param("example") ConfirmRecordExample example);

    int updateByExample(@Param("record") ConfirmRecord record, @Param("example") ConfirmRecordExample example);

    int updateByPrimaryKeySelective(ConfirmRecord record);

    int updateByPrimaryKeyWithBLOBs(ConfirmRecord record);

    int updateByPrimaryKey(ConfirmRecord record);
}