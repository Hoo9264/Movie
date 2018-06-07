package com.xiyou.TTMS.mapper;

import com.xiyou.TTMS.po.Play;
import com.xiyou.TTMS.po.PlayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlayMapper {
    long countByExample(PlayExample example);

    int deleteByExample(PlayExample example);

    int deleteByPrimaryKey(Integer playId);

    int insert(Play record);

    int insertSelective(Play record);

    List<Play> selectByExample(PlayExample example);

    Play selectByPrimaryKey(Integer playId);

    int updateByExampleSelective(@Param("record") Play record, @Param("example") PlayExample example);

    int updateByExample(@Param("record") Play record, @Param("example") PlayExample example);

    int updateByPrimaryKeySelective(Play record);

    int updateByPrimaryKey(Play record);
}