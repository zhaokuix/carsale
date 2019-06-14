package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Market;
import com.gxyan.pojo.Service;
import com.gxyan.vo.MarketQuery;
import com.gxyan.vo.ServiceQuery;

public interface IAfterService {
    ServerResponse addService(Service service);

    ServerResponse getList(ServiceQuery serviceQuery);

    ServerResponse updateService(Service service);
}
