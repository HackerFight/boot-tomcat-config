package com.qiuguan.boot.tomcat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.TimeUnit;

/**
 * @author qiuguan
 * @date 2023/05/29 15:22:05  星期一
 */
@Slf4j
@RestController
public class TomcatController {

    @GetMapping("/tomcat")
    public String tomcat(HttpServletRequest httpServletRequest) throws Exception {
        log.info("线程：{} 处理请求", Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(2);
        return "success";
    }
}
