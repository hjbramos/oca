package somethingelse;

public class Neighbor {
  static public void main(String[] args) {
    Child child = new Child();
    System.out.println("x is " + child.x); // error: x has protected access in Parent (compilation error)
  }
}
