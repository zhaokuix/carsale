package com.zhaokuix.dao;

import com.zhaokuix.pojo.OrderDetails;
import com.zhaokuix.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderDetailsMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    OrderDetails selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);

    List<OrderDetails> selectByOrderId(Long orderId);

    List<Details> selectDetailsByOrderId(Long orderId);

    List<DetailsList> selectSelective(DetailsQuery detailsQuery);

    int selectYesterdayNum();

    List<SalesChart> selectSalesChart(@Param("start") String start, @Param("end") String end);

    IndexSales selectIndexSales(Integer id);

    List<EmpChart> selectEmpChart(@Param("id") Integer id, @Param("date") String date);
}
