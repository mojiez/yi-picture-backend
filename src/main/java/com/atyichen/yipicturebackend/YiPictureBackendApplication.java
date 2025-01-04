package com.atyichen.yipicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.atyichen.yipicturebackend.mapper") // 这是Mybatis的注解
@EnableAspectJAutoProxy(exposeProxy = true) // 开启了以后， 可以通过Spring AOP提供对当前代理对象的访问 使用AopContext.currentProxy() 获取当前的代理对象
public class YiPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiPictureBackendApplication.class, args);
    }

}
