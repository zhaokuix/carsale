package com.zhaokuix.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author zhaokuix
 * @date 2019/1/2 21:18
 */
@Getter
@Setter
public class SeriesTree {
    private Integer value;
    private String label;
    private List<SeriesTree> children;
}
