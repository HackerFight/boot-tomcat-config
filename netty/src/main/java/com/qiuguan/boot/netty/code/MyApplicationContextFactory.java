package com.qiuguan.boot.netty.code;

import org.springframework.boot.web.reactive.context.AnnotationConfigReactiveWebServerApplicationContext;
import org.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qiuguan
 * @date 2023/05/31 22:07:59  星期三
 *
 * @see org.springframework.boot.ApplicationContextFactory
 */
@FunctionalInterface
public interface MyApplicationContextFactory {

    MyApplicationContextFactory DEFAULT = (myWebApplicationType) -> {
        try {
            switch (myWebApplicationType) {
                case SERVLET:
                    return new AnnotationConfigServletWebServerApplicationContext();
                case REACTIVE:
                    return new AnnotationConfigReactiveWebServerApplicationContext();
                default:
                    return new AnnotationConfigApplicationContext();
            }

        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    };


    ConfigurableApplicationContext create(MyWebApplicationType myWebApplicationType);
}
