package com.yang.test.controller;

import com.yang.test.properties.YangProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RefreshScope
public class TestController {

    @Autowired
    private YangProperties yangProperties;

    @Value("${yang.test.age}")
    private Integer age;

    @GetMapping
    public String test() {
        return yangProperties.getName();
    }

    @PostMapping
    public Integer age(){
        return age;
    }
}
