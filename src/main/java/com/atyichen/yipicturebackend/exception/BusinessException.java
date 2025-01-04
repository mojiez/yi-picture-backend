package com.atyichen.yipicturebackend.exception;

import lombok.Getter;

/**
 * @author mojie
 * @date 2025/1/4 20:02
 * @description: 自定义异常， 不建议直接抛出java内置的RuntimeException
 */
@Getter
public class BusinessException extends RuntimeException{
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        // 自己额外添加异常信息
        super(message);
        this.code = errorCode.getCode();
    }

}
