package com.qiuguan.boot.jetty.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiuguan
 * @date 2023/05/30 14:35:53  星期二
 */
@RestController
public class JettyController {


    @GetMapping("/jetty")
    public String helloJetty(){
        return "hello jetty";
    }
}
