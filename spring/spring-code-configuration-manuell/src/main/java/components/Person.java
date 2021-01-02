package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import util.Logger;

public abstract class Person implements Whoami {

    protected Logger logger;

    protected String firstname;
    protected String lastname;
    protected int age;


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public abstract String toString();

    //@Autowired // it works also with other methods not only with setters
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
