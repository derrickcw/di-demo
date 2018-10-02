package demo.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary                     // More then one beans of the same type, make one as default
@Profile({"en", "default"})  // Marked as an English profile, default profile when there is no achieved profile
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Primary Greeting service";
    }
}
