package com.mpfrost.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller
 * @author zxg
 * @since 2020-01-15 16:38:54
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld!!!";
    }
}
