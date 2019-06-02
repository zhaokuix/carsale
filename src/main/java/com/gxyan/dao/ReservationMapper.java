package com.gxyan.dao;

import com.gxyan.pojo.Customer;
import com.gxyan.pojo.Reservation;
import com.gxyan.vo.CustomerQuery;

import java.util.List;

public interface ReservationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reservation record);

    int insertSelective(Reservation record);
//
//    Customer selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(Customer record);
//
//    int updateByPrimaryKey(Customer record);
//
//    List<Customer> selectSelective(CustomerQuery customerQuery);
//
//    Customer selectByIdCard(String idCard);
}
