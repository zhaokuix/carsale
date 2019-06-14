package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Feedback;
import com.gxyan.pojo.Service;
import com.gxyan.vo.FeedbackQuery;
import com.gxyan.vo.ServiceQuery;

public interface IFeedbackService {
    ServerResponse addFeedback(Feedback feedback);

    ServerResponse getList(FeedbackQuery feedbackQuery);

    ServerResponse updateFeedback(Feedback feedback);
}
