package springDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springDemo.coaches.Coach;
import springDemo.sportConfig.SportConfig;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        // read spring config file
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        // call a method on the bean
        System.out.println("TennisCoach said: " + tennisCoach.getDailyWorkOut());

        // call method to get the daily fortune
        System.out.println("TennisCoach said daily fortune: " + tennisCoach.getDailyFortune());

        // close the context
        context.close();
    }

}
