package com.hunau;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/4.
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "学号：201841882319 周宇滔";
    }
}
