import book.Gloo;

public class Test {
  public static void main(String[] args) {
      Gloo gloo = new Gloo();
      gloo.testIt(); // error: doRooThings() has private access in Roo (compilation error)
  }
}
