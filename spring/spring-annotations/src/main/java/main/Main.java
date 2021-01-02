package main;

import components.Person;
import components.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.Logger;
import util.MyLogger;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // IOC
       //Logger lg = context.getBean("myLogger", Logger.class);
       //lg.log("hallo leute ");

        // DI
        Person moamen = context.getBean("student", Person.class);
        moamen.whoami();

        context.close();
    }
}
