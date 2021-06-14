package springDemo.sportConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springDemo.coaches.Coach;
import springDemo.coaches.DanceCoach;
import springDemo.fortuneService.FortuneService;
import springDemo.fortuneService.SadFortuneService;

@Configuration
@ComponentScan("springDemo")
public class SportConfig {

    // define bean for sad fortune service
    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }
    //define bean for dance coach and inject dependency
    @Bean
    public Coach danceCoach() {
        return new DanceCoach(sadFortuneService());
    }
}
