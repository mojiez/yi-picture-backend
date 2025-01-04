package com.atyichen.yipicturebackend.common;

import com.atyichen.yipicturebackend.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;

/**
 * @author mojie
 * @date 2025/1/4 20:15
 * @description: 响应包装类， 每个后端接口都要返回调用码、数据、调用信息， 封装统一的响应结果类
 */
@Data
public class BaseResponse<T> implements Serializable {
    private int code;
    private T data;
    private String message;

    public BaseResponse(int code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public BaseResponse(int code, T data) {
        this(code, data, "");
    }

    /**
     * 将失败的返回结果封装
     * @param errorCode
     */
    public BaseResponse(ErrorCode errorCode) {
        this(errorCode.getCode(), null, errorCode.getMessage());
    }
}
