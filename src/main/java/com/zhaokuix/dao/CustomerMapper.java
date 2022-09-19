package com.zhaokuix.dao;

import com.zhaokuix.pojo.Customer;
import com.zhaokuix.vo.CustomerQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CustomerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

    List<Customer> selectSelective(CustomerQuery customerQuery);

    Customer selectByIdCard(String idCard);
}
