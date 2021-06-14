package springDemo.coaches;

import springDemo.fortuneService.FortuneService;

public class DanceCoach implements Coach{

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
}
