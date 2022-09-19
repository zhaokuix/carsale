package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Service;
import com.zhaokuix.vo.ServiceQuery;

public interface IAfterService {
    ServerResponse addService(Service service);

    ServerResponse getList(ServiceQuery serviceQuery);

    ServerResponse updateService(Service service);
}
