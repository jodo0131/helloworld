package com.jrrtugs.hello_world_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "index"; // Assuming "index.html" is your homepage template
    }

}
