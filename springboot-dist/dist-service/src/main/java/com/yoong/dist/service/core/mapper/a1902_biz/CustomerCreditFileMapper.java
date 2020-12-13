package com.yoong.dist.service.core.mapper.a1902_biz;

import com.yoong.dist.api.domain.a1902_biz.CustomerCreditFile;
import com.yoong.dist.api.domain.a1902_biz.CustomerCreditFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerCreditFileMapper {
    int countByExample(CustomerCreditFileExample example);

    int deleteByExample(CustomerCreditFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerCreditFile record);

    int insertSelective(CustomerCreditFile record);

    List<CustomerCreditFile> selectByExample(CustomerCreditFileExample example);

    CustomerCreditFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerCreditFile record, @Param("example") CustomerCreditFileExample example);

    int updateByExample(@Param("record") CustomerCreditFile record, @Param("example") CustomerCreditFileExample example);

    int updateByPrimaryKeySelective(CustomerCreditFile record);

    int updateByPrimaryKey(CustomerCreditFile record);
}