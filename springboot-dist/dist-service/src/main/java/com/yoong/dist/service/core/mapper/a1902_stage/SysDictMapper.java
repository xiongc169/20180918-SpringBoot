package com.yoong.dist.service.core.mapper.a1902_stage;

import com.yoong.dist.api.domain.a1902_stage.SysDict;
import com.yoong.dist.api.domain.a1902_stage.SysDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysDictMapper {
    int countByExample(SysDictExample example);

    int deleteByExample(SysDictExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    List<SysDict> selectByExampleWithBLOBs(SysDictExample example);

    List<SysDict> selectByExample(SysDictExample example);

    SysDict selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysDict record, @Param("example") SysDictExample example);

    int updateByExampleWithBLOBs(@Param("record") SysDict record, @Param("example") SysDictExample example);

    int updateByExample(@Param("record") SysDict record, @Param("example") SysDictExample example);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKeyWithBLOBs(SysDict record);

    int updateByPrimaryKey(SysDict record);
}