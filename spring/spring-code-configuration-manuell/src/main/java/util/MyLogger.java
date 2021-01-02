package util;



public class MyLogger implements Logger{
    @Override
    public void log(Object obj){
        System.out.println(obj);
    }
}
