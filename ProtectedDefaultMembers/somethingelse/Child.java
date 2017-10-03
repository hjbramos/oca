package somethingelse; // different package
import certification.Parent;

public class Child extends Parent {

    private void testPrivate() {
      System.out.println("private method");
    }
    
    public void testIt() {
      System.out.println("x is " + x); // no problem; child inherits x
    }
}
