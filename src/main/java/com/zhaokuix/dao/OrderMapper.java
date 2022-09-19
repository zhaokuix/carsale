package com.zhaokuix.dao;

import com.zhaokuix.pojo.Order;
import com.zhaokuix.vo.EmpChart;
import com.zhaokuix.vo.OrderList;
import com.zhaokuix.vo.OrderQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    int updatePayTimeByPrimaryKey(Long orderId);

    List<OrderList> selectSale(OrderQuery orderQuery);

    int updateStatusByPrimaryKey(@Param("orderId") Long orderId, @Param("status") String status);

    int addTotalPriceByPrimaryKey(@Param("orderId") Long orderId, @Param("totalPrice") BigDecimal totalPrice);

    List<EmpChart> selectChartByDate(String date);

    List<EmpChart> selectYesterdayChart();
}
