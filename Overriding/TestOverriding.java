class Animal {
  public void eat() {
    System.out.println("Generic Animal Eating Generically");
  }
}

// Horse subclass of Animal overriding the Animal version of the eat() method.
class Horse extends Animal {
  public void eat() {
    System.out.println("Horse eating hay, oats, and horse treats");
  }
}

public class TestOverriding {
  public static void main(String [] args) {
    Horse spirit = new Horse();
    spirit.eat();
  }
}
