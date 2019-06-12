package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Market;

public interface IMarketService {
    ServerResponse addActivity(Market market);
}
