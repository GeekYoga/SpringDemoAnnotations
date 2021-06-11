package springDemo;

import springDemo.coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args) {

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);


        // call a method on the bean
        System.out.println("TrackCoach said: " + trackCoach.getDailyWorkOut());
        System.out.println("TennisCoach said: " + tennisCoach.getDailyWorkOut());


        // close the context
        context.close();
    }

}
