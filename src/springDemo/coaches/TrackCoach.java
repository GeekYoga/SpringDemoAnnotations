package springDemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import springDemo.fortuneService.FortuneService;

@Component
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TrackCoach(@Qualifier("happyFortuneService") FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
