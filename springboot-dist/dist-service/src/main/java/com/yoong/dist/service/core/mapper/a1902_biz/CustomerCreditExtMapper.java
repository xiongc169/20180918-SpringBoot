package com.yoong.dist.service.core.mapper.a1902_biz;

import com.yoong.dist.api.domain.a1902_biz.CustomerCreditExt;
import com.yoong.dist.api.domain.a1902_biz.CustomerCreditExtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCreditExtMapper {
    int countByExample(CustomerCreditExtExample example);

    int deleteByExample(CustomerCreditExtExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerCreditExt record);

    int insertSelective(CustomerCreditExt record);

    List<CustomerCreditExt> selectByExample(CustomerCreditExtExample example);

    CustomerCreditExt selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerCreditExt record, @Param("example") CustomerCreditExtExample example);

    int updateByExample(@Param("record") CustomerCreditExt record, @Param("example") CustomerCreditExtExample example);

    int updateByPrimaryKeySelective(CustomerCreditExt record);

    int updateByPrimaryKey(CustomerCreditExt record);
}