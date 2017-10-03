package somethingelse;

public class Child4 {
  static public void main(String[] args) {
    Child child = new Child();
    child.testPrivate(); // error: testPrivate() has private access in Child
    //child.x; // error: not a statement
    System.out.println(child.doFast()); //error: doFast() has protected access in Parent (compilation error)
  }
}
