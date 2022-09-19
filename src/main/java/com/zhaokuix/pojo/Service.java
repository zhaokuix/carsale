package com.zhaokuix.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Service {
    private Long id;

    private String name;

    private String phone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date serviceDate;

    private String service;

    public Service(Long id, String name, String phone, Date serviceDate, String service) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.serviceDate = serviceDate;
        this.service = service;
    }

    public Service() {
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

    public Date getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(Date serviceDate) {
        this.serviceDate = serviceDate;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }
}
