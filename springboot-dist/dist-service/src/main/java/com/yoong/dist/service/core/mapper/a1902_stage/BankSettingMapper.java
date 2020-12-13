package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.BankSetting;
import com.yoong.dist.api.domain.a1902_stage.BankSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankSettingMapper {
    int countByExample(BankSettingExample example);

    int deleteByExample(BankSettingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BankSetting record);

    int insertSelective(BankSetting record);

    List<BankSetting> selectByExample(BankSettingExample example);

    BankSetting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BankSetting record, @Param("example") BankSettingExample example);

    int updateByExample(@Param("record") BankSetting record, @Param("example") BankSettingExample example);

    int updateByPrimaryKeySelective(BankSetting record);

    int updateByPrimaryKey(BankSetting record);
}