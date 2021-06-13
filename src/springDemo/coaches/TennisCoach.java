package springDemo.coaches;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import springDemo.fortuneService.FortuneService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach{

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    // Define a default constructor
    public TennisCoach() {

    }

    // define my init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("TennisCoach: inside of doMyStartUpStuff");
    }

    // define my init method
    @PreDestroy
    public void doMyCleanUpStuff() {
        System.out.println("TennisCoach: inside of doMyCleanUpStuff");
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
