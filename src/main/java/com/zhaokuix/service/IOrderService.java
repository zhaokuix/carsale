package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.OrderDetails;
import com.zhaokuix.vo.DetailsQuery;
import com.zhaokuix.vo.OrderQuery;
import com.zhaokuix.vo.OrderVo;

/**
 * @author zhaokuix
 * @date 2019/1/2 21:16
 */
public interface IOrderService {
    ServerResponse addOrder(OrderVo orderVo);

    ServerResponse getList(OrderQuery orderQuery);

    ServerResponse update(Long orderId, String status);

    ServerResponse updateDetail(OrderDetails orderDetails);

    ServerResponse deleteDetail(String id);

    ServerResponse getDetailsList(DetailsQuery detailsQuery);
}
