package com.zhaokuix.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Market {
    private Long id;

    private String name;

    private String phone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date activityDate;

    private String detail;

    public Market(Long id, String name, String phone, Date activityDate, String detail) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.activityDate = activityDate;
        this.detail = detail;
    }

    public Market() {
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

    public Date getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Date activityDate) {
        this.activityDate = activityDate;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}
