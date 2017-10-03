class Animal2 {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
}

class Horse2 extends Animal2 {
  public void eat() {
    System.out.println("Horse eating hay, oats, and horse treats.");
  }
  public void buck() { }
}

class Monkey extends Animal2 {

}

public class TestAnimals {
  public static void main(String[] args) {
    Animal2 a = new Animal2();
    Animal2 b = new Horse2();
    a.eat(); // Runs the Animal version of eat()
    b.eat(); // Runs the Horse version of eat()

    // The compiler will allow only methods in class Animal to be invoked when
    // using a reference to an Animal.
    //b.buck(); //error: cannot find symbol (compilation error)
    // Can't invoke buck(); Animal class doesn't have that method.

    Animal2 c = new Monkey();
    c.eat();
  }
}
