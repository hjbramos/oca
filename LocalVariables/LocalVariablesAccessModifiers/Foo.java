public class Foo {
  void doStuff() {
    final int y = 2;
    private int x = 7; // error: illegal start of expression (compilation error)
    this.doMore(x);
  }

  void doMore(int x) {
    System.out.println("x is " + x);
  }
}
