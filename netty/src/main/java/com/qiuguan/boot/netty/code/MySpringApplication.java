package com.qiuguan.boot.netty.code;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author qiuguan
 * @date 2023/05/31 22:15:42  星期三
 *
 * spring的代码真的好优雅，请看 {@link org.springframework.boot.ApplicationContextFactory}
 */
public class MySpringApplication {

    private final MyApplicationContextFactory myApplicationContextFactory = MyApplicationContextFactory.DEFAULT;

    private final MyWebApplicationType webApplicationType;


    public MySpringApplication(MyWebApplicationType webApplicationType) {
        this.webApplicationType = webApplicationType;
    }

    public MySpringApplication() {
        this(MyWebApplicationType.SERVLET);
    }

    public ConfigurableApplicationContext createApplicationContext() {
        return myApplicationContextFactory.create(this.webApplicationType);
    }
}
