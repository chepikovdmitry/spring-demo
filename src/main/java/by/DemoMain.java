package by;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;

public class DemoMain {
    public static void main(String[] args) {
        System.out.println(new Date().getTime());
        RobotA robotA = new RobotA(Arrays.asList(new ActionDance(),new ActionSleep()));
        System.out.println(new Date().getTime());

        robotA.start();
        System.out.println(new Date().getTime());

        ApplicationContext context = new ClassPathXmlApplicationContext("aplication-context.xml");

        System.out.println(new Date().getTime());
        RobotA robotA1 =(RobotA)  context.getBean("robotA");
        RobotA robotA2 =(RobotA) context.getBean("robotA");
        System.out.println(robotA1==robotA2);
        System.out.println(new Date().getTime());

        robotA1.start();
        System.out.println(new Date().getTime());

}
}
