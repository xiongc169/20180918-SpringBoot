package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.ApiServiceRecord;
import com.yoong.dist.api.domain.a1902_stage.ApiServiceRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiServiceRecordMapper {
    int countByExample(ApiServiceRecordExample example);

    int deleteByExample(ApiServiceRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ApiServiceRecord record);

    int insertSelective(ApiServiceRecord record);

    List<ApiServiceRecord> selectByExampleWithBLOBs(ApiServiceRecordExample example);

    List<ApiServiceRecord> selectByExample(ApiServiceRecordExample example);

    ApiServiceRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ApiServiceRecord record, @Param("example") ApiServiceRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") ApiServiceRecord record, @Param("example") ApiServiceRecordExample example);

    int updateByExample(@Param("record") ApiServiceRecord record, @Param("example") ApiServiceRecordExample example);

    int updateByPrimaryKeySelective(ApiServiceRecord record);

    int updateByPrimaryKeyWithBLOBs(ApiServiceRecord record);

    int updateByPrimaryKey(ApiServiceRecord record);
}