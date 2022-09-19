package com.zhaokuix.dao;

import com.zhaokuix.pojo.Car;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


/**
 * @author zhaokuix
 * @date 2019/1/9 21:06
 */
@SpringBootTest
public class CarMapperTest {
    @Autowired
    private CarMapper carMapper;

    @Test
    public void updateRepertoryByPrimaryKey() {
        carMapper.updateRepertoryByPrimaryKey(19010400001L, 1);
    }

    @Test
    public void selectBySeriesId() {
        List<Car> list = carMapper.selectBySeriesId(9);
        System.out.println(list.toString());
    }
}
