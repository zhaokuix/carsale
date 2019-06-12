package com.gxyan.service.impl;

import com.gxyan.common.ServerResponse;
import com.gxyan.dao.ServiceMapper;
import com.gxyan.pojo.Service;
import com.gxyan.service.IAfterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@org.springframework.stereotype.Service
public class AfterServiceImpl implements IAfterService {
    @Autowired
    private ServiceMapper serviceMapper;

    @Override
    public ServerResponse addService(Service service) {
        service.setId(createServiceId());
        int resultCount = serviceMapper.insertSelective(service);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("添加失败");
    }


    /**
     * 客户编号
     * 格式为：yyMMdd 加 五位递增的数字，数字每天重置为1
     * @return
     */
    private Long createServiceId() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        String format = dateFormat.format(new Date()) + "10000";
        return Long.valueOf(format) + (num++);
    }

    private int num = 1;

    @Scheduled(cron="0 0 0 * * ?")
    private void clearNum() {
        num = 1;
    }
}
