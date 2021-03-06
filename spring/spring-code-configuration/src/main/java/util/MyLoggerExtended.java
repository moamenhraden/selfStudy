package util;

import org.springframework.stereotype.Component;

@Component
public class MyLoggerExtended implements Logger{
    @Override
    public void log(Object object) {
        System.out.println("====================================");
        System.out.println(object);
        System.out.println("====================================");
    }
}
