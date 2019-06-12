package com.gxyan.service.impl;

import com.gxyan.common.ServerResponse;
import com.gxyan.dao.FeedbackMapper;
import com.gxyan.pojo.Feedback;
import com.gxyan.service.IFeedbackService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

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
