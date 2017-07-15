package com.qinjiangbo.dubbo;

import java.util.HashMap;
import java.util.Map;

/**
 * @date: 16/07/2017 12:38 AM
 * @author: qinjiangbo@github.io
 */
public class LoginServiceImpl implements LoginService {

    static Map<String, String> db = new HashMap<>();

    static {
        db.put("Richard", "123456");
        db.put("Amy", "654321");
    }

    @Override
    public boolean exist(String userName) {
        return db.containsKey(userName);
    }

    @Override
    public boolean login(String userName, String password) {
        boolean existed = false;
        if (db.containsKey(userName)) {
            if (db.get(userName).equals(password)) {
                existed = true;
            }
        }
        return existed;
    }
}
