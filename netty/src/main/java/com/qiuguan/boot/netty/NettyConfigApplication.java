package com.qiuguan.boot.netty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.netty.NettyWebServer;

/**
 * @author qiuguan
 * @date 2023/05/30 18:10:09  星期二
 *
 * 相比 tomcat, undertow, jetty 来说，netty的启动相对复杂，当然了如果直接导入 {spring-boot-starter-webflux} 依赖直接用就可以了
 * 但是如果不想导入这个依赖而启动netty的话，就要费点功夫了。
 *
 * 在构建 {@link SpringApplication} 对象时，其构造器内部会根据 {@link WebApplicationType} 来构建容器类型
 * 比如SERVLET, REACTIVE, NONE(非web容器), tomcat, undertow, jetty, 都会构建 {@link WebApplicationType#SERVLET} 容器
 * 而netty 则需要存在 {@link org.springframework.web.reactive.DispatcherHandler}, 而这个类是存在于上面提到的web-flux依赖中
 * 所以如果不想引入{spring-boot-starter-webflux}依赖，就需要自己去构建netty容器了。
 *
 * 我看官方提供了一个 {spring-boot-starter-reactor-netty} 依赖，但是它内部没有{@link org.springframework.web.reactive.DispatcherHandler}
 * 所以依然无法创建 {@link WebApplicationType#REACTIVE} 类型的容器
 *
 */
@SpringBootApplication
public class NettyConfigApplication {

    public static void main(String[] args) {

        SpringApplication.run(NettyConfigApplication.class, args);
    }
}
