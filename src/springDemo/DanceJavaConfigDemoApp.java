package springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springDemo.coaches.DanceCoach;
import springDemo.sportConfig.SportConfig;

public class DanceJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        DanceCoach myCoach = context.getBean("danceCoach", DanceCoach.class);

        // call a method on the bean
        System.out.println("DanceCoach said: " + myCoach.getDailyWorkOut());

        // call method to get the daily fortune
        System.out.println("DanceCoach said daily fortune: " + myCoach.getDailyFortune());

        // call new dance coach methods... has the props values injected
        System.out.println("DanceCoach email: " + myCoach.getEmail());
        System.out.println("DanceCoach team: " + myCoach.getTeam());

        // close the context
        context.close();
    }

}
