package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService  {

    @Autowired
    private RequestService requestService ;

    public String test(){
        new Thread(){
            @Override
            public void run() {
                /**
                 * TODO 这里获取出错requestService
                 */
                requestService.test();
            }
        }.start();

        return "1234";
    }

}
