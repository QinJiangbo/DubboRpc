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
                new ClassPathXmlApplicationContext("conf/dubbo-service-consumer.xml");
        context.start();

        LoginService loginService = (LoginService) context.getBean("loginService");
        System.out.println("Richard existed? " + loginService.exist("Richard"));

        try {
            TimeUnit.SECONDS.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
