package com.gxyan.dao;

import com.gxyan.pojo.Feedback;
import com.gxyan.vo.FeedbackQuery;

import java.util.List;

public interface FeedbackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);

    List<Feedback> selectSelective(FeedbackQuery feedbackQuery);
}