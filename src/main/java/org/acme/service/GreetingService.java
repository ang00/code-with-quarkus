package org.acme.service;

import javax.enterprise.context.ApplicationScoped;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/12/8 10:00
 * @Version: v1.0
 * @Modified：
 * @Description:
 */
@ApplicationScoped
public class GreetingService {
    public String greeting(String name){
        return "hello " + name;
    }
}
