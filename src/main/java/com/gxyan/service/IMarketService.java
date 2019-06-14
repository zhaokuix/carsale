package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Market;
import com.gxyan.vo.MarketQuery;

public interface IMarketService {
    ServerResponse addActivity(Market market);

    ServerResponse getList(MarketQuery marketQuery);

    ServerResponse updateMarket(Market market);
}
