package memento.mysolution;

import memento.mysolution.MyEditor;

public class Main {
    public static void main(String[] args) {
        var my = new MyEditor();
        my.setContent("this is the first line ");
        my.setContent("this is the second line ");
        System.out.println(my.toString());
        my.undo();
        System.out.println(my.toString());


    }
}
