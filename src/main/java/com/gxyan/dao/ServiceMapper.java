package com.gxyan.dao;

import com.gxyan.pojo.Service;
import com.gxyan.vo.ServiceQuery;

import java.util.List;

public interface ServiceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);

    List<Service> selectSelective(ServiceQuery serviceQuery);
}