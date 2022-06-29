package com.example.client1;

import com.ctc.wstx.msv.GenericMsvValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("client1")
@EnableEurekaClient
public class TestController {
    Environment env;
    @Autowired
    public TestController(Environment env){
        this.env=env;
    }

    @Value("${posco.name}")
    String name;
    @Value("${jwt.secret}")
    String ret;

    @Value("${posco.datasource.url}")
    String url;
    @GetMapping

    public String test(HttpServletRequest request){
        return "client 1 효정이  " + env.getProperty("local.server.port") + " " + request.getServerPort();
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello"+ " "+url ;
    }

    @GetMapping("/{id}")
    public String id(){
        return "id";
    }
}

