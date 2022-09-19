package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Feedback;
import com.zhaokuix.vo.FeedbackQuery;

public interface IFeedbackService {
    ServerResponse addFeedback(Feedback feedback);

    ServerResponse getList(FeedbackQuery feedbackQuery);

    ServerResponse updateFeedback(Feedback feedback);
}
