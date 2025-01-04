package com.atyichen.yipicturebackend.controller;

import com.atyichen.yipicturebackend.common.BaseResponse;
import com.atyichen.yipicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mojie
 * @date 2025/1/4 21:26
 * @description:
 */
@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
