package com.qinjiangbo.dubbo;

/**
 * @date: 20/07/2017 11:54 PM
 * @author: qinjiangbo@github.io
 */
public interface RegisterService {

    boolean register(String name, String password);
    boolean bind(Long userId, String mobile);
}
