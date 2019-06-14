package com.gxyan.service;

import com.gxyan.common.ServerResponse;
import com.gxyan.pojo.Reservation;
import com.gxyan.vo.ReservationQuery;

public interface IReservationService {
    ServerResponse addReservation(Reservation reservation);

    ServerResponse getList(ReservationQuery reservationQuery);

    ServerResponse updateReservation(Reservation reservation);
}

