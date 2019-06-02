package com.gxyan.dao;

import com.gxyan.pojo.Reservation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ReservationMapperTest {
    @Autowired
    private ReservationMapper reservationMapper;

    @Test
    public void Insert() {
        Reservation record = new Reservation();
        record.setId(123456L);
        record.setName("王晓明");
        int list = reservationMapper.insert(record);
        System.out.println(list);
    }
}
