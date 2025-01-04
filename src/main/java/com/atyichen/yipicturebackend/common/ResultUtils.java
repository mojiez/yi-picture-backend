package com.atyichen.yipicturebackend.common;

import com.atyichen.yipicturebackend.exception.ErrorCode;

/**
 * @author mojie
 * @date 2025/1/4 20:24
 * @description: 每次返回结果， 都要手动new一个BaseResponse对象， 很麻烦
 */
public class ResultUtils {

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<>(0, data, "ok");
    }

    // 当你使用 <T> 时，Java 编译器需要明确泛型的类型，即使是失败场景，data 字段为 null，它仍需要显式提供一个 null 值来匹配泛型 T。
    // 这里使用 <?> 代表可以接受任意类型 不关心， 避免了调用时显式指定类型 null
    public static BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }


    /**
     * 失败
     *
     * @param code    错误码
     * @param message 错误信息
     * @return 响应
     */
    public static BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, null, message);
    }

    /**
     * 失败
     *
     * @param errorCode 错误码
     * @return 响应
     */
    public static BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), null, message);
    }


}
