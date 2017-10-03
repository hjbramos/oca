class Foo {
  void doStuff() {
    System.out.println("do Stuff.");
  }
}

class Bar extends Foo {
  void doStuff(String s) {
    System.out.println("do stuff: " + s);
  }
}

public class InheritedOverloadedMethod {
  public static void main(String [] args) {
    Bar bar = new Bar();
    bar.doStuff("eat");
    bar.doStuff();
  }
}

// The Bar class has two doStuff() methods: the no-arg version it inherits from
// Foo (and does not override) and the overloaded doStuff(String s) defined in the
// Bar class. Code with a reference to a Foo can invoke only the no-arg version,
// but code with a reference to a Bar can invoke either of the overload versions.
