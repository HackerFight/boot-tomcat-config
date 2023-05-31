package com.qiuguan.boot.netty.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author qiuguan
 * @date 2023/05/30 18:10:49  星期二
 */
@Slf4j
@RestController
public class NettyController {

    @GetMapping("/netty")
    public String helloNetty() throws InterruptedException {
        log.info("线程：{} 处理请求", Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        return "hello netty.....";
    }
}
