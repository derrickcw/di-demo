package demo.springframework.didemo.controllers;

import demo.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    // Marked this to identify the bean that should be consumed (It required a single bean)
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    // Spring Automatically wire constructor based components
    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
