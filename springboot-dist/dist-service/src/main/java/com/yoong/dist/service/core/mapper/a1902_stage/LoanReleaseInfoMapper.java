package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.LoanReleaseInfo;
import com.yoong.dist.api.domain.a1902_stage.LoanReleaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanReleaseInfoMapper {
    int countByExample(LoanReleaseInfoExample example);

    int deleteByExample(LoanReleaseInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanReleaseInfo record);

    int insertSelective(LoanReleaseInfo record);

    List<LoanReleaseInfo> selectByExample(LoanReleaseInfoExample example);

    LoanReleaseInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanReleaseInfo record, @Param("example") LoanReleaseInfoExample example);

    int updateByExample(@Param("record") LoanReleaseInfo record, @Param("example") LoanReleaseInfoExample example);

    int updateByPrimaryKeySelective(LoanReleaseInfo record);

    int updateByPrimaryKey(LoanReleaseInfo record);
}