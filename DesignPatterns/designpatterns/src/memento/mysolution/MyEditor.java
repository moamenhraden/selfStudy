package memento.mysolution;

import java.util.Stack;

/*
 * problem with this solution :
 * if we add a new field in the future
 * we have to change the list to store the
 * history (previous values)  of the two instance variables
 * or we have to add a new list for the new instance
 * variable.
 * => this design is not scalable
 *
 * MyEditor has multiple responsibilities
 * 1 - editor
 * 2 - state management
 * 3 - history
 *
 * solution : encapsulation
 * a class has only  one responsibility
 * => separate responsibilities in deferent classes.
 *
 * to solve the scalability problem
 * we can store the the content of
 * the editor in state obj
 * in this way when we add a new field
 * we have to change only the state class
 *
 * ====
 * this is the momento pattern
 * the abstract names of the classes
 * - originator : editor
 * - momento : state
 * - caretaker : history
 */


public class MyEditor {
    private Stack<String> history;
    private String content;

    public MyEditor(){
        history = new Stack<>();
    }

    public MyEditor(String content) {
        this.content = content;
        history = new Stack<>();
    }

    public void undo(){
        this.content = this.history.pop();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.history.push(this.content);
        this.content = content;
    }


    @Override
    public String toString() {
        return "MyEditor{" +
                "content='" + content + '\'' +
                '}';
    }
}
