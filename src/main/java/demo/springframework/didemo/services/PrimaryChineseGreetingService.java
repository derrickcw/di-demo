package demo.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("ch")      // Marked as an chinese profile
@Primary
public class PrimaryChineseGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "您好 - 中文默认注入";
    }
}
