package springDemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import springDemo.fortuneService.FortuneService;

@Component
public class TennisCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    // Define a default constructor
    public TennisCoach() {

    }

//    // Define any method for dependency injection
//    @Autowired
//    public void doSomeStuff(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }

//    @Autowired
//    public TennisCoach(FortuneService theFortuneService) {
//        fortuneService = theFortuneService;
//    }

    @Override
    public String getDailyWorkOut() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
