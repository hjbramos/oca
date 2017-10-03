public class Animal {
    
    private Animal animal;
    private String noise;
    
    // Constructors can use access modifier, including private.
    // The constructor name must match the name of the class.
    // The default constructor is ALWAYS a no-arg constructor
    private Animal() {
       this.noise = "Animal making a noise.." ;
    }
    
    // It's legal (but stupid). It isn't a constructor.
    void Animal() {
        
    }
       
    public void makeNoise() {
        System.out.println(this.noise);
    }
    
    public static Animal getInstance() {
        return new Animal();
    }
    
}