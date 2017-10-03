public class Foo2 {
    int size;
    String name;
    
    Foo2(String name, int size) {
        this.name = name;
        this.size = size;
    }
    
    // It isn't a constructor
    void Foo2() {
        
    }
    
    public static void main(String[] args) {
        
        Foo2 f = new Foo2("Helder", 31); // no problem. Arguments march the Foo2 constructor.
        
        Foo2 foo = new Foo2(); // won't compile 
        // actual and formal argument lists differ in length
    }
}