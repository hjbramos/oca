public class Bar {
	public static void main(String[] args)
	{
		Foo2 foo2 = new Foo2();
		foo2.setLocal("It's a static variable.");
		System.out.println(foo2.getLocal());
		Foo2 foo3 = new Foo2();
		System.out.println(foo3.getLocal());
	}
}