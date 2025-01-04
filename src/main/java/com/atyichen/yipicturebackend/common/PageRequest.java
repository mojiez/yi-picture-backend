package com.atyichen.yipicturebackend.common;

import lombok.Data;

/**
 * @author mojie
 * @date 2025/1/4 21:19
 * @description: 请求包装类
 */
@Data
public class PageRequest {

    /**
     * 当前页号
     */
    private int current = 1;

    /**
     * 页面大小
     */
    private int pageSize = 10;

    /**
     * 排序字段
     */
    private String sortField;

    /**
     * 排序顺序（默认降序）
     */
    private String sortOrder = "descend";
}
