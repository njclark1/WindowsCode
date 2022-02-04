package com.cgi.ectp.first.us;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/first/v1")
public class Controller {

//    @GetMapping("/hello")
//    public String hello() {
//        return "hello";
//    }

    @GetMapping("/firstname")
    public String firstname(@RequestHeader String firstname) {
        return "hello " + firstname;
    }

    @GetMapping("hello/{lastname}")
    public String lastname(@RequestParam String lastname) {
        return "hello " + lastname;
    }

    @GetMapping("/hello")
    public String hello(@RequestHeader String firstname, @RequestParam String lastname) {
        return "hello " + firstname + " " + lastname;
    }
}
//requestmapping
