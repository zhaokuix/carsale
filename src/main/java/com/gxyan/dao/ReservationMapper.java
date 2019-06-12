package com.gxyan.dao;

import com.gxyan.pojo.Reservation;

public interface ReservationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    Reservation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);
}