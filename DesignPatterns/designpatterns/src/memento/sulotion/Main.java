package memento.sulotion;

import java.util.Stack;

// entry point 
public class Main{
    public static void main(String[] args) {
        var ed = new Editor();
        var h = new History();
        ed.setContent("hallo from moamen");
        h.push(ed.createState());
        System.out.println(ed);
        ed.setContent("hallo from kenan");
        h.push(ed.createState());
        System.out.println(ed);
        ed.setContent("hallo from imam");
        System.out.println(ed);
        // undo
        ed.restoreState(h.pop());
        System.out.println(ed);

        // undo 2
        ed.restoreState(h.pop());
        System.out.println(ed);
    }
}

////////////define momento api ///////////////////////

// ~ editor
interface Originator<T>{
    T createState();
    void restoreState(T prevState);
}

// ~ history
interface CareTaker<T>{
    void push(T state);
    T pop();
}

// Memento should not have an Interface
// because it is just a data-container
// it should not have any functionality



/////////////////// implementation //////////////////////////


class Editor implements Originator<Editor.EditorState> {
    private String content;
    public Editor(){

    }

    public Editor(String content) {
        this.content = content;
    }


    public EditorState createState(){
        return new EditorState(this.content);
    }

    public void restoreState(EditorState state){
        this.content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Editor{" +
                "content='" + content + '\'' +
                '}';
    }

    // this is innerclass because
    // it has implementation details
    // note : you can also define EditorState as top-level class
    class EditorState{
        // state must be immutable.
        private final String content;

        EditorState(String content) {
            this.content = content;
        }

        public String getContent() {
            return content;
        }
    }
}



class History implements CareTaker<Editor.EditorState>{
    private Stack<Editor.EditorState> states;

    public History(){
        this.states = new Stack<Editor.EditorState>();
    }

    public void push(Editor.EditorState state){
        this.states.push(state);
    }

    public Editor.EditorState pop(){
        return this.states.pop();
    }
}