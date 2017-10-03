class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
}

class Horse extends Animal {
  public void eat() {
    System.out.println("Horse eating hay");
  }
  public void eat(String s) {
    System.out.println("Horse eating " + s);
  }
}

public class LegalIllegalOverrides {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat(); // Generic Animal Eating Generically

    Horse h =  new Horse();
    h.eat(); // Horse eating hay

    Animal ah = new Horse();
    ah.eat(); // Horse eating hay
    // Ploymorphism works - the actual object type (Horse), not the reference
    // type (Animal), is used to determine which eat() is called.

    Horse he = new Horse();
    he.eat("Apples"); // Horse eating Apples
    // The overloaded eat (String s) method is invoked.

    Animal a2 = new Animal();
    a2.eat("treats"); // error: method eat in class Animal cannot be applied to given types;
    // required: no arguments
    // found: String
    // reason: actual and formal argument lists differ in length
    // Compile error! Compiler sees that the Animal class doesn't have an eat() method
    // that takes a String

    Animal ah2 = new Horse();
    ah2.eat("Carrots"); // error: method eat in class Animal cannot be applied to given types;
    // Compiler error! Compiler still looks only at the reference and sees that Animal doesn't
    // have an eat() method that takes a String. Compiler doesn't care that the actual object
    // might be a Horse at runtime.
  }
}
