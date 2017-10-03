package subclass;

public class Bar extends Foo {

  public String doFoo() // it is not an overriding method!
  {
    return "FooBar";
  }

  public String doBar()
  {
    return "Bar";
  }
}
