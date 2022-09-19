package com.zhaokuix.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author zhaokuix
 * @date 2019/1/14 12:10
 */
@Data
public class SalesChart {
    private String date;

    private BigDecimal income;

    private BigDecimal expenditure;

    private BigDecimal profit;
}
