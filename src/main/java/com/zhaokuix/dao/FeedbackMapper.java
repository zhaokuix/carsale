package com.zhaokuix.dao;

import com.zhaokuix.pojo.Feedback;
import com.zhaokuix.vo.FeedbackQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FeedbackMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Feedback record);

    int insertSelective(Feedback record);

    Feedback selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);

    List<Feedback> selectSelective(FeedbackQuery feedbackQuery);
}
