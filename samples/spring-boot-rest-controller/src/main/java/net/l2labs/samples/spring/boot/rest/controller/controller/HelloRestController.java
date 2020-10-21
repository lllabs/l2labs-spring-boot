package net.l2labs.samples.spring.boot.rest.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping({"", "/"})
    public String hello() {
        return "Hello World!";
    }

}
