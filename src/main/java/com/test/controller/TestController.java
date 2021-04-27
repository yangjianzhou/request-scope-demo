package com.test.controller;

import com.test.service.RequestService;
import com.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    public RequestService requestService ;

    @Autowired
    private TestService testService ;

    @GetMapping("/test-one-thread")
    public String testInOnThread(){
        requestService.test();
        return "success";
    }

    @GetMapping("/test-sub-thread")
    public String testInSubThread(){
        testService.test();
        return "success";
    }
}
