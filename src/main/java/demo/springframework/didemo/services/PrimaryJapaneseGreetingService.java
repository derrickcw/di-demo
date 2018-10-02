package demo.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ja")
public class PrimaryJapaneseGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "こんにちは - プライマリーグリーティングサービス";
    }
}
