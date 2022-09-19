package com.zhaokuix.controller;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Reservation;
import com.zhaokuix.service.IReservationService;
import com.zhaokuix.vo.ReservationQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaokuix
 * @date 2019/1/6 10:03
 */
@Slf4j
@RestController
@RequestMapping("drive")
public class ReservationController {

    @Autowired
    private IReservationService reservationService;

    @RequestMapping(value = "addReservation", method = RequestMethod.GET)
    public ServerResponse addReservation(Reservation reservation) {
        return reservationService.addReservation(reservation);
    }
    @RequestMapping(value = "getList", method = RequestMethod.GET)
    public ServerResponse getList(ReservationQuery reservationQuery) {
        return reservationService.getList(reservationQuery);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ServerResponse update(Reservation reservation) {
        return reservationService.updateReservation(reservation);
    }
}
