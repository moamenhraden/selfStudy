package main;

import components.Person;
import components.Student;
import config.PersonConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import util.Logger;
import util.MyLogger;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(PersonConfig.class);
        Person moamen = context.getBean("student", Person.class);
        moamen.whoami();
    }
}
