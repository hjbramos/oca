public class Ravine {
    Ravine(String name, int size) {
        System.out.println(name);
        System.out.println(size);
    }
    
    Ravine(String name) {
        //Ravine(name, 23); // won't compile
        this(name, 23);
    }
}