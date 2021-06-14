package springDemo.coaches;

import org.springframework.beans.factory.annotation.Value;
import springDemo.fortuneService.FortuneService;

public class DanceCoach implements Coach{

    @Value("${foo.email}")
    private String email;
    @Value("${foo.team}")
    private String team;
    private FortuneService fortuneService;

    public DanceCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkOut() {
        return "Today we practice salsa";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
