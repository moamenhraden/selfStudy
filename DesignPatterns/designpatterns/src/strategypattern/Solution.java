
//package strategypattern;

/*
solution : 
we need a different behavior depending on the type of 
- compressor 
- filter 
=> polymorphism
?????
what is the different between strategy pattern and 
state pattern ? 
- state pattern : you have only one object 
and depeding on its type you have different behavior. 
- strategy pattern : you have multiple object ( compressor, filter )
and depending on the combination of the two types you have 
a certain behavior. 
*/

public class Solution {
      public static void main(String[] args) {
           ImageStorage2 is = new ImageStorage2(new PngCompressor(), new BlurFilter());
           is.store();
      }
}

interface Compressor{
     void compress();
}

interface Filter {
      void apply();
}

class PngCompressor implements Compressor{

      @Override
      public void compress() {
            // TODO Auto-generated method stub
            System.out.println("compressor png");
      }

}

class JpgCompressor implements Compressor{

      @Override
      public void compress() {
            // TODO Auto-generated method stub
            System.out.println("compressor : jpg");
      }

}


class BWFilter implements Filter{

      @Override
      public void apply() {
            // TODO Auto-generated method stub
            System.out.println("filter : BW");
      }

}

class BlurFilter implements Filter{

      @Override
      public void apply() {
            // TODO Auto-generated method stub
            System.out.println("Filter : Blur ");
      }
}

class ImageStorage2{
      private Compressor compressor;
      private Filter filter;

      public ImageStorage2(Compressor compressor, Filter filter) {
            this.compressor = compressor;
            this.filter = filter;
      }

      public void store(){
           this.compressor.compress();
           this.filter.apply();
           System.out.println("DONE :)");
      }
}