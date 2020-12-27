//package strategypattern;

/*
problems : 
- class has multiple responsibility 
- not extensible 
*/

public class Problem {
    public static void main(String[] args) {
        ImageStorage is = new ImageStorage("png", "blur");
        is.store();
    }
}

class ImageStorage {
    private String compressor; // jpg, jpeg, png, ...
    private String filter; // blur, b&w, ...

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    public void store(){
        // differenct behavior depending on the compressor type 
        if(this.compressor == "png"){
            System.out.println("compresser : png");
        }else if (this.compressor == "jpg"){
            System.out.println("copresser");
        }
        // ....

        // different behavior depending on the filter type 
        if(this.filter == "b&w"){
            System.out.println("filter : b&w");
        }else if (this.filter == "blur"){
            System.out.println("filter : blur");
        }
    }
}
