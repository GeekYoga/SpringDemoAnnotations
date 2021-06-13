package springDemo;

import springDemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springDemo.coaches.SwimCoach;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);

        // call a method on the bean
        // System.out.println("TrackCoach said: " + trackCoach.getDailyWorkOut());
        System.out.println("TennisCoach said: " + tennisCoach.getDailyWorkOut());

        // call method to get the daily fortune
        // System.out.println("TrackCoach said daily fortune: " + trackCoach.getDailyFortune());
        System.out.println("TennisCoach said daily fortune: " + tennisCoach.getDailyFortune());

//        System.out.println("SwimCoach said daily fortune: " + swimCoach.getDailyFortune());
//        System.out.println("SwimCoach email: " + swimCoach.getEmail());
//        System.out.println("SwimCoach team: " + swimCoach.getTeam());

        // close the context
        context.close();
    }

}
