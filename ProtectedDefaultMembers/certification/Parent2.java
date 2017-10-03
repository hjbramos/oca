package certification;

public class Parent2 {
  public static void main(String[] args) {
    Parent parent = new Parent();
    System.out.println("y is " + parent.y); // No problem; package-level
  }
}
