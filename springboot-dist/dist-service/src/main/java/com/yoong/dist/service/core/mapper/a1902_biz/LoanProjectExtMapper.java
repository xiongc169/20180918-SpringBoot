package com.yoong.dist.service.core.mapper.a1902_biz;

import com.yoong.dist.api.domain.a1902_biz.LoanProjectExt;
import com.yoong.dist.api.domain.a1902_biz.LoanProjectExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoanProjectExtMapper {
    int countByExample(LoanProjectExtExample example);

    int deleteByExample(LoanProjectExtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LoanProjectExt record);

    int insertSelective(LoanProjectExt record);

    List<LoanProjectExt> selectByExample(LoanProjectExtExample example);

    LoanProjectExt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LoanProjectExt record, @Param("example") LoanProjectExtExample example);

    int updateByExample(@Param("record") LoanProjectExt record, @Param("example") LoanProjectExtExample example);

    int updateByPrimaryKeySelective(LoanProjectExt record);

    int updateByPrimaryKey(LoanProjectExt record);
}