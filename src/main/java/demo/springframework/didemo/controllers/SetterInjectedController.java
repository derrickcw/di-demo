package demo.springframework.didemo.controllers;

import demo.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired      // Let Spring automatically injection
    @Qualifier("setterGreetingService")     // Marked this to identify the bean that should be consumed (It required a single bean)
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
