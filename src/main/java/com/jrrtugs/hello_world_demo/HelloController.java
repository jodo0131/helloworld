package com.jrrtugs.hello_world_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        model.addAttribute("message", "Hello World! This is a sample application");
        return "index"; // Assuming "index.html" is your homepage template
    }

    @GetMapping("/")
    public String handleError() {
        return "error"; // for error page
    }

}
