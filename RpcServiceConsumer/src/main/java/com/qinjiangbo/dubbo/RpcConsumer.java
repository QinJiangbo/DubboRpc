package com.qinjiangbo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @date: 16/07/2017 12:44 AM
 * @author: qinjiangbo@github.io
 */
public class RpcConsumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config/dubbo-service-consumer.xml");
        context.start();

        LoginService loginService = (LoginService) context.getBean("loginService");
        System.out.println("Does user 'Richard' exist? " + loginService.exist("Richard"));

        boolean flag = loginService.login("Richard", "123456");
        System.out.println(flag ? "Login succeed!" : "Login failed!");
    }
}
