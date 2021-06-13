package springDemo.fortuneService;

import org.springframework.stereotype.Component;
import springDemo.fortuneService.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
