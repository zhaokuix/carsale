package com.zhaokuix.service;

import com.zhaokuix.common.ServerResponse;
import com.zhaokuix.pojo.Brand;
import com.zhaokuix.vo.SeriesTree;

import java.util.List;

/**
 * @author zhaokuix
 * @date 2019/1/3 12:56
 */
public interface IInitService {

    /**
     * 封装车系选择
     * @return
     */
    ServerResponse<List<SeriesTree>> seriesOpt();

    /**
     * 封装品牌选择
     * @return
     */
    ServerResponse<List<Brand>> brandOpt();

    ServerResponse storeOpt(Integer seriesId);

    ServerResponse getCustomer(String idCard);
}
