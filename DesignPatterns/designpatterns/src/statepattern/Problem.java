package statepattern;

public class Problem {
    public static void main(String[] args) {

    }
}

// constants
enum ToolType{
    SELECTION,
    BRUSH,
    ERASER
}

// problem with this approach
// it is not extensible
// if you want to add a new functionality
// then you have to do multiple changes in the code

class canvas {

    private ToolType currentTool;

    public void mouseDown(){
        if(currentTool == ToolType.BRUSH){
            System.out.println("brush");
        }else if (currentTool == ToolType.SELECTION){
            System.out.println("selection");
        }else if (currentTool == ToolType.ERASER){
            System.out.println("eraser");
        }
    }

    public void mouseUP(){
        if(currentTool == ToolType.BRUSH){
            System.out.println("brush");
        }else if (currentTool == ToolType.SELECTION){
            System.out.println("selection");
        }else if (currentTool == ToolType.ERASER){
            System.out.println("eraser");
        }
    }
}

