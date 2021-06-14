package springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springDemo.coaches.Coach;
import springDemo.sportConfig.SportConfig;

public class DanceJavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach myCoach = context.getBean("danceCoach", Coach.class);

        // call a method on the bean
        System.out.println("DanceCoach said: " + myCoach.getDailyWorkOut());

        // call method to get the daily fortune
        System.out.println("DanceCoach said daily fortune: " + myCoach.getDailyFortune());

        // close the context
        context.close();
    }

}
