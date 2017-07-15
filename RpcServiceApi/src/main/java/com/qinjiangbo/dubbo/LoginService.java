package com.qinjiangbo.dubbo;

/**
 * @date: 16/07/2017 12:31 AM
 * @author: qinjiangbo@github.io
 */
public interface LoginService {

    boolean exist(String userName);

    boolean login(String userName, String password);
}
