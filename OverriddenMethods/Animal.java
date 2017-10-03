public class Animal {
    private void eat() {
        System.out.println("Generic Animal Eating Generically");
    }
    
    protected void run() {
        System.out.println("Generic Animal Running Generically");
    }
    
    void walk() {
        System.out.println("Generic Animal Walking Generically");
    }
    
    void sleep() {
        System.out.println("Generic Animal Sleeping Generically");
    }
    
    final void live() {
        System.out.println("Generic Animal living Generically");
    }
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat(); // eat() Animal
        animal.run(); // run() Animal
        animal.walk(); // walK() Animal
        animal.sleep(); // sleep() Animal
        animal.live();
        
        Animal animal2 = new Horse();
        animal2.eat(); // eat() Animal
        animal2.run(); // run() Horse
        animal2.walk(); // walk() Horse
        animal2.sleep(); // sleep() Horse
        // error: ride() has private access in Horse
        // animal2.ride(); // ride() Horse 
        animal2.live();
        
        Horse horse = new Horse();
        horse.eat(); // eat() Horse
        horse.run(); // run() Horse
        horse.walk(); // walk() Horse
        horse.sleep(); // sleep() Horse
        horse.ride(); // ride() Horse
    }
}

class Horse extends Animal {
    
    // can't overriding a private method
    public void eat() {
        System.out.println("Horse eating hay, oast, and horse treats");
    }
    
    // The access level CAN be less restrictive than that of the overridden method
    public void run() {
        System.out.println("Horse is running...");
    }
    
    // attempting to assign weaker access privileges; was package
    //private void walk() {
    //    System.out.println("Horse walking...");
    //}
    
    protected void walk() {
        System.out.println("Horse is walking...");
    }
    
    // error: sleep() in Horse cannot override sleep() in Animal
    // return type String is not compatible with void
    //String sleep() {
    //    System.out.println("Horse sleeping...");
    //    return "sleep";
    //}
    
    public void ride() {
        System.out.println("Horse is riding...");
    }
    
    //  error: live() in Horse cannot override live() in Animal
    //  overridden method is final
    //public void live() {
    //    System.out.println("Horse is living...");
    //}
}