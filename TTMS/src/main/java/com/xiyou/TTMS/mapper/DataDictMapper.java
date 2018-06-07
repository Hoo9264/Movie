package com.xiyou.TTMS.mapper;

import com.xiyou.TTMS.po.DataDict;
import com.xiyou.TTMS.po.DataDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DataDictMapper {
    long countByExample(DataDictExample example);

    int deleteByExample(DataDictExample example);

    int deleteByPrimaryKey(Integer dictId);

    int insert(DataDict record);

    int insertSelective(DataDict record);

    List<DataDict> selectByExample(DataDictExample example);

    DataDict selectByPrimaryKey(Integer dictId);

    int updateByExampleSelective(@Param("record") DataDict record, @Param("example") DataDictExample example);

    int updateByExample(@Param("record") DataDict record, @Param("example") DataDictExample example);

    int updateByPrimaryKeySelective(DataDict record);

    int updateByPrimaryKey(DataDict record);
}