package com.javakc.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @RequestMapping("query")
    public String query()
    {
        System.out.println("user controller method");
        return "user";
    }
}
