package com.cgi.ectp.first.us;

import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
