package com.qiuguan.boot.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author qiuguan
 * @date 2023/05/30 18:10:09  星期二
 *
 * 相比 tomcat, undertow, jetty 来说，netty
 */
@SpringBootApplication
public class NettyConfigApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(NettyConfigApplication.class, args);
    }
}
