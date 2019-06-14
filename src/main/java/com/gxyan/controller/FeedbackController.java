package com.gxyan.controller;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Feedback;
import com.gxyan.pojo.Service;
import com.gxyan.service.IFeedbackService;
import com.gxyan.vo.FeedbackQuery;
import com.gxyan.vo.ServiceQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("feedback")
public class FeedbackController {
    @Autowired
    private IFeedbackService feedbackService;

    @RequestMapping(value = "addFeedback", method = RequestMethod.GET)
    public ServerResponse addFeedback(Feedback feedback) {
        return feedbackService.addFeedback(feedback);
    }

    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(FeedbackQuery feedbackQuery) {
        return feedbackService.getList(feedbackQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse updateFeedback(Feedback feedback) {
        return feedbackService.updateFeedback(feedback);
    }
}
