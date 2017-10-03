class Animal {
    void makeNoise() {
        System.out.println("generic noise.");
    }
}

class Dog extends Animal implements Pet {
    void makeNoise() {
        System.out.println("bark");
    }
    void playDead() {
        System.out.println("roll over");
    }
    public void beFriendly() {
        System.out.println("shake the tail");
    }
}

class Pug extends Dog {
    
}

class Beagle extends Dog implements Pet {
    
}

class Cat extends Animal {
    void makeNoise() {
        System.out.println("miau");
    }
    void playDead() {
        System.out.println("lie down");
    }
}

interface Pet {
    public abstract void beFriendly();
    
    // Implementation classes are NOT required to implement an interface's static or default methods.
    public static void doStuff() {
        System.out.println("do stuff statically");
    }
}

class CastTest {
    public static void main(String[] args) {
        Animal[] a = { new Animal(), new Dog(), new Animal(), new Cat(), new Pug() };
        for(Animal animal : a) {
            animal.makeNoise();
            //animal.playDead(); // error: cannot find symbol
            if(animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.playDead();
                
                Animal a1 = d; // upcast ok with no explicit cast
                Animal a2 = (Animal) d; // upcast ok with an explicit cast
            }
            
            if(animal instanceof Cat) {
                Cat c = (Cat) animal;
                c.playDead();
            }
            
            // String s = (String) animal; // error: incompatible types: Animal cannot be converted to String 
            
            // java.lang.ClassCastException: Animal cannot be cast to Dog (runtime)
            //Dog d = (Dog) animal; // Compile - but it's not secure.  Exception in runtime
            //d.playDead();
        }
        
        Dog calvin = new Dog();
        Pet pet = (Pet) calvin; // Dog can be explicitly cast to a Pet interface.
        Pet pet2 = calvin; // Dog can be implicitly cast to a Pet interface.
        pet.beFriendly(); // ...but the only Dog method you can invoke then is beFriendly()
        //pet.playDead(); // you can't invoke this. (error: cannot find symbol)
        
        Pug elvis = new Pug(); // Pug is still a Pet! Because it extends Dog, and Dog's already taken care of the Pet parts for itself and for all its children.
        Pet pet3 = (Pet) elvis;
        pet3.beFriendly(); 
        
        Beagle beag = new Beagle();
        beag.beFriendly(); // Beagle still doesn't need to implement the beFriendly() method if the Dog class (Beagle's superclass) has already taken care of that. Beagle IS-A Dog and IS-A Pet.
        
        Animal a2 = new Dog();
        ((Dog) a2).makeNoise();
    }
}