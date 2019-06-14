package com.gxyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.gxyan.common.ServerResponse;
import com.gxyan.dao.FeedbackMapper;
import com.gxyan.pojo.Feedback;
import com.gxyan.service.IFeedbackService;
import com.gxyan.vo.FeedbackQuery;
import com.gxyan.vo.ListVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class FeedbackServiceimpl implements IFeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    @Override
    public ServerResponse addFeedback(Feedback feedback) {
        feedback.setId(createFeedbackId());
        int resultCount = feedbackMapper.insertSelective(feedback);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("添加失败");
    }

    @Override
    public ServerResponse getList(FeedbackQuery feedbackQuery) {
        List<com.gxyan.pojo.Service> list = PageHelper.startPage(feedbackQuery.getPage(), feedbackQuery.getLimit()).doSelectPage(()-> feedbackMapper.selectSelective(feedbackQuery));
        if (list != null) {
            ListVo listVo = new ListVo();
            listVo.setItems(list);
            listVo.setTotal(PageHelper.count(()->feedbackMapper.selectSelective(feedbackQuery)));
            return ServerResponse.createBySuccess(listVo);
        }
        return ServerResponse.createByErrorMessage("获取市场活动列表失败");
    }

    @Override
    public ServerResponse updateFeedback(Feedback feedback) {
        int resultCount = feedbackMapper.updateByPrimaryKeySelective(feedback);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        log.error(feedback.toString());
        return ServerResponse.createByErrorMessage("更新失败");
    }


    /**
     * 客户编号
     * 格式为：yyMMdd 加 五位递增的数字，数字每天重置为1
     * @return
     */
    private Long createFeedbackId() {
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
