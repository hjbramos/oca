// overridden method is final
public class SubClass extends SuperClass {
  public void doStuff() { // error: doStuff() in SubClass cannot override doStuff() in SuperClass (compilation error)
    System.out.println("doStuff in subclass");
  }
}
