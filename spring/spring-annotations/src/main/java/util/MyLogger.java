package util;


// id is automatic generated
// by default id : classname
// first letter is lowercase.

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class MyLogger implements Logger{
    @Override
    public void log(Object obj){
        System.out.println(obj);
    }
}
