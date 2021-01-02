package components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Student extends Person {


    private String major;


    /*public Student( @Value("${moamen.firstname}")String firstname,
                    @Value("${moamen.lastname}") String lastname,
                    @Value("${moamen.age}") int age,
                    @Value("${moamen.major}") String major) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.major = major;
    }*/

    @PostConstruct
    public void init(){
        System.out.println("object is created");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("object is destroyed");
    }

    @Override
    public void whoami() {
        logger.log("I am " + this.firstname + "\n" +
                "I am Studying " + this.major);
    }

    @Override
    public String toString() {
        return "major : " + this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
