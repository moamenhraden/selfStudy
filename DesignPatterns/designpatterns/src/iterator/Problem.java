package iterator;


/*
* the problem with this approach is
* the methods to retrieve Items from a Collection
* can be different between different classes
* to use a certain class i should always know which methods
* should i use to retrieve items from this class
*
* */

public class Problem {
    public static void main(String[] args) {
        var list = new MyList<Integer>();
        list.push(10);
        list.push(20);
        //System.out.println(list.pop());
        //System.out.println(list.pop());

        for(int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}

class MyList<T>{
    private int capacity ;
    private T [] arr;
    private int index;

    public MyList(){
        this(10);
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.arr = (T[]) new Object[capacity];
        this.index = 0 ;
    }

    public void push(T el){
        this.arr[this.index++] = el ;
    }

    public T pop(){
        if(this.index > 0 ){
            return this.arr[--this.index];
        }else{
            return null;
        }
    }

    public T get(int index){
        if(index > this.index){
            throw new IndexOutOfBoundsException();
        }
        return this.arr[index];
    }

    public int size(){
        return this.index;
    }
}