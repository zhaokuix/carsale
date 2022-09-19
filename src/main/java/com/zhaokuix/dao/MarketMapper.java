package com.zhaokuix.dao;

import com.zhaokuix.pojo.Market;
import com.zhaokuix.vo.MarketQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface MarketMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Market record);

    int insertSelective(Market record);

    Market selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Market record);

    int updateByPrimaryKey(Market record);

    List<Market> selectSelective(MarketQuery marketQuery);
}
