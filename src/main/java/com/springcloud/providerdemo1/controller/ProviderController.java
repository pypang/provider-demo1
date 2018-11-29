package com.springcloud.providerdemo1.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
public class ProviderController {

    @RequestMapping("provider/demo")
    public String Demo(){
        return  "ProviderDemo";
    }



}
