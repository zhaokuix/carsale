package com.gxyan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private String gender;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date reservationDate;

}
