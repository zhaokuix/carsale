package com.zhaokuix.dao;

import com.zhaokuix.pojo.Service;
import com.zhaokuix.vo.ServiceQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ServiceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);

    List<Service> selectSelective(ServiceQuery serviceQuery);
}
