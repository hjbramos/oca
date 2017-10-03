public class B extends A {
  void foo(int i) {
    //  error: B is not abstract and does not override abstract method foo() in A (compilation error)
    // It is simply an overload method (a method using the same identifier, but different arguments)
  }
}
