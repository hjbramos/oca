package somethingelse; // different package
import certification.Parent;

public class Child2 extends Parent {
    public void testIt() {
      Parent p = new Parent();
      System.out.println("x is " + p.x); //  error: x has protected access in Parent (compilation error)
    }
}
