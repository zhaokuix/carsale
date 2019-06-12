package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Feedback;

public interface IFeedbackService {
    ServerResponse addFeedback(Feedback feedback);
}
