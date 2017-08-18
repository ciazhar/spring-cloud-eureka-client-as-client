package com.ciazhar.eurekaclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ciazhar on 8/18/17.
 */

@RestController
public class SImpleController {
    @Autowired private RestTemplate restTemplate;

    @RequestMapping("/api/halo")
    public String halo(){
        return restTemplate.getForObject("http://eureka-client/api/halo",String.class);
    }
}
