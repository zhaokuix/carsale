package com.gxyan.dao;

import com.gxyan.pojo.Market;
import com.gxyan.vo.MarketQuery;

import java.util.List;

public interface MarketMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Market record);

    int insertSelective(Market record);

    Market selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Market record);

    int updateByPrimaryKey(Market record);

    List<Market> selectSelective(MarketQuery marketQuery);
}