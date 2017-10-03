package book;
import cert.Roo;

public class Gloo {
  public void testIt() {
    Roo roo = new Roo();
    System.out.println(roo.doRooThings()); // error: doRooThings() has private access in Roo (compilation error)
  }
}
