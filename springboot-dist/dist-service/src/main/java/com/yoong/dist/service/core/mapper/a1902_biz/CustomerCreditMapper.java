package com.yoong.dist.service.core.mapper.a1902_biz;

import com.yoong.dist.api.domain.a1902_biz.CustomerCredit;
import com.yoong.dist.api.domain.a1902_biz.CustomerCreditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCreditMapper {
    int countByExample(CustomerCreditExample example);

    int deleteByExample(CustomerCreditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerCredit record);

    int insertSelective(CustomerCredit record);

    List<CustomerCredit> selectByExample(CustomerCreditExample example);

    CustomerCredit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerCredit record, @Param("example") CustomerCreditExample example);

    int updateByExample(@Param("record") CustomerCredit record, @Param("example") CustomerCreditExample example);

    int updateByPrimaryKeySelective(CustomerCredit record);

    int updateByPrimaryKey(CustomerCredit record);
}