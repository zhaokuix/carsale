package com.zhaokuix.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.dao.ServiceMapper;
import com.zhaokuix.pojo.Service;
import com.zhaokuix.service.IAfterService;
import com.zhaokuix.vo.ListVo;
import com.zhaokuix.vo.ServiceQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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

    @Override
    public ServerResponse getList(ServiceQuery serviceQuery) {
        List<Service> list = PageHelper.startPage(serviceQuery.getPage(), serviceQuery.getLimit()).doSelectPage(()-> serviceMapper.selectSelective(serviceQuery));
        if (list != null) {
            ListVo listVo = new ListVo();
            listVo.setItems(list);
            listVo.setTotal(PageHelper.count(()->serviceMapper.selectSelective(serviceQuery)));
            return ServerResponse.createBySuccess(listVo);
        }
        return ServerResponse.createByErrorMessage("获取售后服务列表失败");
    }

    @Override
    public ServerResponse updateService(Service service) {
        int resultCount = serviceMapper.updateByPrimaryKeySelective(service);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        log.error(service.toString());
        return ServerResponse.createByErrorMessage("更新失败");
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
