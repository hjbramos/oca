class Collar { }

public class Dog {
    
    Collar c;       // instance variable (heap)
    String name;    // instance variable (heap)
    
    public static void main(String[] args) { // main() is placed on the stack
        Dog d; // reference variable d is created on the stack, but there's no Dog object yet
        d = new Dog(); // A new Dog object is created on the heap and is assigned to the d reference variable.
        d.go(d); // A copy of the reference variable d is passed to the go() method.
    }
    
    void go(Dog dog) {   // local variable: dog (stack)
        c = new Collar(); //A new Collar object is created on the heap and assigned to Dog's instance variable
        dog.setName("Aiko");  // setName() is added to the stack, with the dogName parameter as its local variable.
    }
    
    void setName(String dogName) {
        name = dogName; // String object "Aiko" (heap) // The name instance variable now also refers to the String object.
        
        //setName() completes and is removed from the stack. At this point local variable dogName disappears, too, although the String object it referred to is still on the heap.
        
        // do more stuff
    }
}

// Notice that two different local variables refer to the same Dog object
// Notice that one local variable and one instance variable both refer to the same String Aiko.