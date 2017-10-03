public class Dog {
    
    private String name;
    
    Dog() {
        // if extends Animal. error: Animal() has private access in Animal
        
        System.out.println("Dog's default constructor.");
    }
    
    Dog(String name) {
        this(); // call default constructor.
        this.name = name; 
        // this();  // error: call to this must be first statement in constructor
    }
    
    public String getName() {
        return this.name;
    }
}