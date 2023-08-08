package kresnofatihimani.com.github.springbootgradlelearn.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {
    @GetMapping("/get")
    public String getGreeting() {
        return "Hello";
    }
}
