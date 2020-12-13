package com.yoong.dist.service.core.mapper.a1902_biz;

import com.yoong.dist.api.domain.a1902_biz.LoanProjectInfo;
import com.yoong.dist.api.domain.a1902_biz.LoanProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanProjectInfoMapper {
    int countByExample(LoanProjectInfoExample example);

    int deleteByExample(LoanProjectInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanProjectInfo record);

    int insertSelective(LoanProjectInfo record);

    List<LoanProjectInfo> selectByExample(LoanProjectInfoExample example);

    LoanProjectInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanProjectInfo record, @Param("example") LoanProjectInfoExample example);

    int updateByExample(@Param("record") LoanProjectInfo record, @Param("example") LoanProjectInfoExample example);

    int updateByPrimaryKeySelective(LoanProjectInfo record);

    int updateByPrimaryKey(LoanProjectInfo record);
}