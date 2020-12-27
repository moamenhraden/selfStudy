package statepattern;

// the solution of mosh is the same
public class MySolution {
    public static void main(String[] args) {
        var can = new Canvas();
        can.setTool(new Eraser());
        can.mouseDown();
    }
}


interface Tool {
    void mouseDown();
    void mouseUp();
}

class Eraser implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Eraser:mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("Eraser:mouseUp");
    }
}


class Brush implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Bruh:mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush:mouseUp");
    }
}


class Selection implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("selection:mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("selection:mouseUp");
    }
}


class Canvas{
        private Tool tool;

        public void mouseDown(){
            tool.mouseDown();
        }

        public void mouseUp(){
            tool.mouseUp();
        }

        public void setTool(Tool tool){
            this.tool = tool;
    }
}