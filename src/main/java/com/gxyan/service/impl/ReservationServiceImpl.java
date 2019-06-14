package com.gxyan.service.impl;

import com.github.pagehelper.PageHelper;
import com.gxyan.common.ServerResponse;
import com.gxyan.dao.ReservationMapper;
import com.gxyan.pojo.Reservation;
import com.gxyan.service.IReservationService;
import com.gxyan.vo.ListVo;
import com.gxyan.vo.ReservationQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Slf4j
@Service
public class ReservationServiceImpl implements IReservationService {

    @Autowired
    private ReservationMapper reservationMapper;

    @Override
    public ServerResponse addReservation(Reservation reservation) {
        reservation.setId(createReservationId());
        int resultCount = reservationMapper.insertSelective(reservation);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        return ServerResponse.createByErrorMessage("添加失败");
    }

    @Override
    public ServerResponse getList(ReservationQuery reservationQuery) {
        List<Reservation> list = PageHelper.startPage(reservationQuery.getPage(), reservationQuery.getLimit()).doSelectPage(()-> reservationMapper.selectSelective(reservationQuery));
        if (list != null) {
            ListVo listVo = new ListVo();
            listVo.setItems(list);
            listVo.setTotal(PageHelper.count(()->reservationMapper.selectSelective(reservationQuery)));
            return ServerResponse.createBySuccess(listVo);
        }
        return ServerResponse.createByErrorMessage("获取预约列表失败");
    }

    @Override
    public ServerResponse updateReservation(Reservation reservation) {
        int resultCount = reservationMapper.updateByPrimaryKeySelective(reservation);
        if (resultCount != 0) {
            return ServerResponse.createBySuccess();
        }
        log.error(reservation.toString());
        return ServerResponse.createByErrorMessage("更新失败");
    }

    /**
     * 客户编号
     * 格式为：yyMMdd 加 五位递增的数字，数字每天重置为1
     * @return
     */
    private Long createReservationId() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
        String format = dateFormat.format(new Date()) + "10000";
        return Long.valueOf(format) + (num++);
    }

    private int num = 1;

    @Scheduled(cron="0 0 0 * * ?")
    private void clearNum() {
        num = 1;
    }
}

