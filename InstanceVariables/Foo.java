public class Foo {
	
	private String name; // instance variable
	private String surname; // instance variable
	private String manager; // instance variable
	
	public void doStuff() {
		public String notInstanceVariable; // error: illegal start of expression (compilation error)
	}
}