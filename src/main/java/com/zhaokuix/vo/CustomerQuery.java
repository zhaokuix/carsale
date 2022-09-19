package com.zhaokuix.vo;

import lombok.Data;

/**
 * @author zhaokuix
 * @date 2019/1/6 13:29
 */
@Data
public class CustomerQuery {
    private int page = 1;

    private int limit = 5;

    private Long id;

    private String name;

    private String phone;

    private String idCard;

    private String orderBy;
}
