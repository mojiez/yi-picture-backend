package com.atyichen.yipicturebackend.common;

import java.io.Serializable;

/**
 * @author mojie
 * @date 2025/1/4 21:20
 * @description: 删除请求包装类
 */
public class DeleteRequest implements Serializable {
    private Long id;

    private static final long serialVersionUID = 1L; // todo 序列化版本号的作用？
}
