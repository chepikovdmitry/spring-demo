package by;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class DemoMain {
    public static void main(String[] args) {
       /* System.out.println(new Date().getTime());
        RobotA robotA = new RobotA(Arrays.asList(new ActionDance(),new ActionSleep()));
        System.out.println(new Date().getTime());

        robotA.start();
        System.out.println(new Date().getTime());*/

        ApplicationContext context = new ClassPathXmlApplicationContext("aplication-context.xml");

        RobotA robotA1 = context.getBean(RobotA.class);
        RobotA robotA2 = context.getBean(RobotA.class);
        System.out.println(robotA1==robotA2);

        robotA1.start();

}
}
