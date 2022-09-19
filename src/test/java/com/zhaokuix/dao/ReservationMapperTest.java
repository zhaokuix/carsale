package com.zhaokuix.dao;

import com.zhaokuix.pojo.Reservation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;


@SpringBootTest
public class ReservationMapperTest {
    @Autowired
    private ReservationMapper reservationMapper;

    @Test
    public void Insert() {
        Reservation record = new Reservation();
        record.setId(1234567L);
        record.setName("王晓明");
        record.setPhone("110");
        record.setGender("男");
        record.setReservationDate(new Date());
        record.setIdCard("110110110");
        int list = reservationMapper.insert(record);
        System.out.println(list);
    }
}
