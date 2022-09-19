package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;

/**
 * @author zhaokuix
 * @date 2019/1/13 9:18
 */
public interface IChartService {

    ServerResponse getEmpChart(String date);

    ServerResponse getIndexChart();

    ServerResponse getSaleNum();

    ServerResponse getSalesChart(String start, String end);

    ServerResponse getIndexSales(Integer id);

    ServerResponse getEmpSalesChart(Integer id, String date);
}
