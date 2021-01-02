package components;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import util.Logger;

public class Student extends Person {


    @Value("${moamen.major}")
    private String major;

    public Student(){

    }

    public Student( String firstname,
                   String lastname,
                   int age,
                   String major) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.major = major;
    }

    public Student(Logger logger){
        this.logger = logger;
    }

    public void init(){
        System.out.println("object is created");
    }

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
