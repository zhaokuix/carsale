package com.gxyan.vo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class FeedbackQuery {
    private int page = 1;

    private int limit = 5;

    private Long id;

    private String name;

    private String phone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date feedbackDate;

    private String orderBy;
}
