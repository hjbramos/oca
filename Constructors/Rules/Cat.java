public class Cat {
    
    private String name;
    
    // The compiler won't provide the no-arg constructor.
    Cat(String name) {
        // if extends Animal. error: Animal() has private access in Animal
        
        this.name = name;
    }
}