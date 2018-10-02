package demo.springframework.didemo.controllers;

import demo.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }

    @Autowired      // Let Spring automatically injection
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
