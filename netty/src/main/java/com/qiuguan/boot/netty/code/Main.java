package com.qiuguan.boot.netty.code;

import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author qiuguan
 * @date 2023/05/31 22:18:25  星期三
 */
public class Main {

    public static void main(String[] args) {

        MySpringApplication springApplication = new MySpringApplication();
        ConfigurableApplicationContext applicationContext = springApplication.createApplicationContext();
        System.out.println("applicationContext = " + applicationContext);
    }
}
