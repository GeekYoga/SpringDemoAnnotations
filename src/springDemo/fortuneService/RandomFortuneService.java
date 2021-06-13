package springDemo.fortuneService;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {

    private String[] fortunes = new String[] {"Fortune 1!", "Fortune 2!", "Fortune 3!"};

    private Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.length);
        return fortunes[index];
    }
}
