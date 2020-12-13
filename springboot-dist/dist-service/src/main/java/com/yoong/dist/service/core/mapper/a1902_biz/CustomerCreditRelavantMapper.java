package com.yoong.dist.service.core.mapper.a1902_biz;

import com.yoong.dist.api.domain.a1902_biz.CustomerCreditRelavant;
import com.yoong.dist.api.domain.a1902_biz.CustomerCreditRelavantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCreditRelavantMapper {
    int countByExample(CustomerCreditRelavantExample example);

    int deleteByExample(CustomerCreditRelavantExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerCreditRelavant record);

    int insertSelective(CustomerCreditRelavant record);

    List<CustomerCreditRelavant> selectByExample(CustomerCreditRelavantExample example);

    CustomerCreditRelavant selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerCreditRelavant record, @Param("example") CustomerCreditRelavantExample example);

    int updateByExample(@Param("record") CustomerCreditRelavant record, @Param("example") CustomerCreditRelavantExample example);

    int updateByPrimaryKeySelective(CustomerCreditRelavant record);

    int updateByPrimaryKey(CustomerCreditRelavant record);
}