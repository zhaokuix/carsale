package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Reservation;
import com.zhaokuix.vo.ReservationQuery;

public interface IReservationService {
    ServerResponse addReservation(Reservation reservation);

    ServerResponse getList(ReservationQuery reservationQuery);

    ServerResponse updateReservation(Reservation reservation);
}

