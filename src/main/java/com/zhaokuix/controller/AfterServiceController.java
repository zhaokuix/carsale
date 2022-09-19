package com.zhaokuix.controller;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Service;
import com.zhaokuix.service.IAfterService;
import com.zhaokuix.vo.ServiceQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("service")
public class AfterServiceController {
    @Autowired
    private IAfterService afterService;

    @RequestMapping(value = "addService", method = RequestMethod.GET)
    public ServerResponse addService(Service service) {
        return afterService.addService(service);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(ServiceQuery serviceQuery) {
        return afterService.getList(serviceQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Service service) {
        return afterService.updateService(service);
    }
}
