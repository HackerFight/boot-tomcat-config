package com.qiuguan.boot.jetty.config;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;

/**
 * @author qiuguan
 * @date 2023/05/30 16:25:09  星期二
 *
 * 以编码的形式演示一下jetty的配置，也可以在配置文件中配置
 */
@Configuration
public class JettyConfiguration {

    @Bean
    public ConfigurableServletWebServerFactory createWebServerFactory(){
        JettyServletWebServerFactory jettyWebServer = new JettyServletWebServerFactory();
        jettyWebServer.setPort(8001);
        jettyWebServer.setContextPath("/web");
        //并没有生效
        jettyWebServer.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404.html"));
        return jettyWebServer;
    }
}
