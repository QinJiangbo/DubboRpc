package com.qinjiangbo.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @date: 16/07/2017 12:45 AM
 * @author: qinjiangbo@github.io
 */
public class RpcProvider {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("config/dubbo-service-provider.xml");
        context.start();
        try {
            TimeUnit.SECONDS.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
