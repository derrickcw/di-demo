package demo.springframework.didemo.controllers;

import demo.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Spring Automatically wire constructor based components
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
