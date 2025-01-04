package com.atyichen.yipicturebackend.exception;

/**
 * @author mojie
 * @date 2025/1/4 20:09
 * @description: 现在有了自定义异常， 再进行一步封装， 使得抛出异常更方便
 */
public class ThrowUtils {
    /**
     * 条件成立则抛异常
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition, RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition, new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition, new BusinessException(errorCode, message));
    }
}
