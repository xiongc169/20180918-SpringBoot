package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.CallbackRecord;
import com.yoong.dist.api.domain.a1902_stage.CallbackRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CallbackRecordMapper {
    int countByExample(CallbackRecordExample example);

    int deleteByExample(CallbackRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CallbackRecord record);

    int insertSelective(CallbackRecord record);

    List<CallbackRecord> selectByExampleWithBLOBs(CallbackRecordExample example);

    List<CallbackRecord> selectByExample(CallbackRecordExample example);

    CallbackRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CallbackRecord record, @Param("example") CallbackRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") CallbackRecord record, @Param("example") CallbackRecordExample example);

    int updateByExample(@Param("record") CallbackRecord record, @Param("example") CallbackRecordExample example);

    int updateByPrimaryKeySelective(CallbackRecord record);

    int updateByPrimaryKeyWithBLOBs(CallbackRecord record);

    int updateByPrimaryKey(CallbackRecord record);
}