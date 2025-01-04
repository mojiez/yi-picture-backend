package com.atyichen.yipicturebackend.exception;

import com.atyichen.yipicturebackend.common.BaseResponse;
import com.atyichen.yipicturebackend.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author mojie
 * @date 2025/1/4 20:38
 * @description: 全局异常处理器 为了防止意料之外的异常， 利用 AOP切面全局对业务异常和 RuntimeException进行捕获
 */
@RestControllerAdvice // 用于全局处理 @RestController 标注的控制器中的异常和返回值。 可以理解成针对 RestController的增强模块 它拦截控制器的异常或响应，并对其进行统一的逻辑处理。
@Slf4j
public class GlobalExceptionHandler {
    /**
     * @ExceptionHandler 的工作方式：
     * 	•	它可以单独在控制器中使用，也可以在 @RestControllerAdvice 中使用。
     * 	•	当放在 @RestControllerAdvice 中时，会应用于所有 @RestController 的方法。
     * 	•	当放在某个控制器中时，只对该控制器有效。
     *
     */

    @ExceptionHandler(BusinessException.class) // 	@ExceptionHandler 是一个方法级别的注解，用于捕获指定类型的异常。
    public BaseResponse<?> businessExceptionHandler(BusinessException e) {
        log.error("BusinessException", e);
        return ResultUtils.error(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHandler(RuntimeException e) {
        log.error("RuntimeException", e);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, "系统错误");
    }
}
