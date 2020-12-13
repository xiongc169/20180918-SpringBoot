package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.ApiSendRecord;
import com.yoong.dist.api.domain.a1902_stage.ApiSendRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiSendRecordMapper {
    int countByExample(ApiSendRecordExample example);

    int deleteByExample(ApiSendRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiSendRecord record);

    int insertSelective(ApiSendRecord record);

    List<ApiSendRecord> selectByExampleWithBLOBs(ApiSendRecordExample example);

    List<ApiSendRecord> selectByExample(ApiSendRecordExample example);

    ApiSendRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiSendRecord record, @Param("example") ApiSendRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiSendRecord record, @Param("example") ApiSendRecordExample example);

    int updateByExample(@Param("record") ApiSendRecord record, @Param("example") ApiSendRecordExample example);

    int updateByPrimaryKeySelective(ApiSendRecord record);

    int updateByPrimaryKeyWithBLOBs(ApiSendRecord record);

    int updateByPrimaryKey(ApiSendRecord record);
}