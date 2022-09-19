package com.zhaokuix.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Reservation {
    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private String gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationDate;

    public Reservation(Long id, String name, String phone, String idCard, String gender, Date reservationDate) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.idCard = idCard;
        this.gender = gender;
        this.reservationDate = reservationDate;
    }

    public Reservation() {
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}
