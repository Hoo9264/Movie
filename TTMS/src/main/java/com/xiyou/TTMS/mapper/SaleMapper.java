package com.xiyou.TTMS.mapper;

import com.xiyou.TTMS.po.Sale;
import com.xiyou.TTMS.po.SaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleMapper {
    long countByExample(SaleExample example);

    int deleteByExample(SaleExample example);

    int deleteByPrimaryKey(Long saleId);

    int insert(Sale record);

    int insertSelective(Sale record);

    List<Sale> selectByExample(SaleExample example);

    Sale selectByPrimaryKey(Long saleId);

    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);
}