package com.gxyan.controller;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Service;
import com.gxyan.service.IAfterService;
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
}
