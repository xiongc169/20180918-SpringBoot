package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.OrderRecord;
import com.yoong.dist.api.domain.a1902_stage.OrderRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderRecordMapper {
    int countByExample(OrderRecordExample example);

    int deleteByExample(OrderRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OrderRecord record);

    int insertSelective(OrderRecord record);

    List<OrderRecord> selectByExample(OrderRecordExample example);

    OrderRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OrderRecord record, @Param("example") OrderRecordExample example);

    int updateByExample(@Param("record") OrderRecord record, @Param("example") OrderRecordExample example);

    int updateByPrimaryKeySelective(OrderRecord record);

    int updateByPrimaryKey(OrderRecord record);
}