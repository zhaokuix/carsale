package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Market;
import com.zhaokuix.vo.MarketQuery;

public interface IMarketService {
    ServerResponse addActivity(Market market);

    ServerResponse getList(MarketQuery marketQuery);

    ServerResponse updateMarket(Market market);
}
