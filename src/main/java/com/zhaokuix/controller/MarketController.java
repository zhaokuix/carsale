package com.zhaokuix.controller;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Market;
import com.zhaokuix.service.IMarketService;
import com.zhaokuix.vo.MarketQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("market")
public class MarketController {
    @Autowired
    private IMarketService marketService;

    @RequestMapping(value = "addActivity", method = RequestMethod.GET)
    public ServerResponse addActivity(Market market) {
        return marketService.addActivity(market);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(MarketQuery marketQuery) {
        return marketService.getList(marketQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Market market) {
        return marketService.updateMarket(market);
    }
}
