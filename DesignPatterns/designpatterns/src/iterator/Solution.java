package iterator;

public class Solution {
    public static void main(String[] args) {
        var list = new MyList2<String>();
        list.push("hallo");
        list.push("hallo2");
        list.push("hallo3");
        Iterator<String> it = list.iterate();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

interface Iterator<T>{
    T next();
    boolean hasNext();
}


class MyList2<T>{
    private int capacity ;
    private T [] arr;
    private int index;

    public MyList2(){
        this(10);
    }

    public MyList2(int capacity) {
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

    public Iterator<T> iterate(){
        return new MyIterator(this.arr, this.index);
    }

    private class MyIterator implements Iterator<T>{

        private int size;
        private T list[];
        private int index;


        private MyIterator(T list[], int size){
            this.size = size;
            this.list = list;
            this.index = 0 ;
        }

        @Override
        public T next() {
            return this.list[index++];
        }

        @Override
        public boolean hasNext() {
            return this.index < this.size ? true : false;
        }
    }
}