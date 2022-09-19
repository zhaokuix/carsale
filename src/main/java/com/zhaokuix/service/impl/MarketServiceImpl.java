package com.zhaokuix.service.impl;

import com.github.pagehelper.PageHelper;
import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.dao.MarketMapper;
import com.zhaokuix.pojo.Market;
import com.zhaokuix.service.IMarketService;
import com.zhaokuix.vo.ListVo;
import com.zhaokuix.vo.MarketQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class MarketServiceImpl implements IMarketService {
    @Autowired
    private MarketMapper marketMapper;

    @Override
    public ServerResponse addActivity(Market market) {
        market.setId(createMarketId());
        int resultCount = marketMapper.insertSelective(market);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("添加失败");
    }

    @Override
    public ServerResponse getList(MarketQuery marketQuery) {
        List<Market> list = PageHelper.startPage(marketQuery.getPage(), marketQuery.getLimit()).doSelectPage(()-> marketMapper.selectSelective(marketQuery));
        if (list != null) {
            ListVo listVo = new ListVo();
            listVo.setItems(list);
            listVo.setTotal(PageHelper.count(()->marketMapper.selectSelective(marketQuery)));
            return ServerResponse.createBySuccess(listVo);
        }
        return ServerResponse.createByErrorMessage("获取市场活动列表失败");
    }

    @Override
    public ServerResponse updateMarket(Market market) {
        int resultCount = marketMapper.updateByPrimaryKeySelective(market);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        log.error(market.toString());
        return ServerResponse.createByErrorMessage("更新失败");
    }


    /**
     * 客户编号
     * 格式为：yyMMdd 加 五位递增的数字，数字每天重置为1
     * @return
     */
    private Long createMarketId() {
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
