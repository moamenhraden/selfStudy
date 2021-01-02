package config;

import components.Person;
import components.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.validation.annotation.Validated;
import util.Logger;
import util.MyLogger;

@Configuration
@PropertySource("classpath:LiteralValues.properties")
public class PersonConfig {
    @Bean
    public Logger logger(){
        return new MyLogger();
    }

    @Bean
    public Person person(){
        Student student = new Student();
        student.setLogger(logger());
        return student;
    }
}
