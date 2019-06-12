package com.gxyan.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Feedback {
    private Long id;

    private String name;

    private String phone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date feedbackDate;

    private String feedback;

    public Feedback(Long id, String name, String phone, Date feedbackDate, String feedback) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.feedbackDate = feedbackDate;
        this.feedback = feedback;
    }

    public Feedback() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback == null ? null : feedback.trim();
    }
}