package com.zhaokuix.dao;

import com.zhaokuix.pojo.Reservation;
import com.zhaokuix.vo.ReservationQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReservationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Reservation record);

    int insertSelective(Reservation record);

    Reservation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Reservation record);

    int updateByPrimaryKey(Reservation record);

    List<Reservation> selectSelective(ReservationQuery reservationQuery);
}
