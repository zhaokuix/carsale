package com.zhaokuix.impl;


import com.zhaokuix.service.IOrderService;
import com.zhaokuix.vo.OrderQuery;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhaokuix
 * @date 2019/1/10 12:14
 */
@SpringBootTest
public class OrderServiceImplTest {

    @Autowired
    private IOrderService orderService;

    @Test
    public void getList() {
        orderService.getList(new OrderQuery());
    }

}
