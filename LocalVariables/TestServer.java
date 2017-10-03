public class TestServer {
	
	static String shadowing = "It's a instance variable. (shadowing)";
	
	public void logIn() {
		int count = 10;
		String name;
		//public localVariable = 100; // error: illegal start of expression (compilation error)
		
		System.out.println(count);
		//System.out.println(name); //  error: variable name might not have been initialized (compilation error)
	}
	
	public void doSomething(int i) {
		//count = i; // error: cannot find symbol (compilation error)
	}
	
	public void shadowingExample() {
		String shadowing = "It's a local variable. (shadowing)";
		System.out.println(shadowing);
	}
	
	public static void main(String[] args ){
		TestServer server = new TestServer();
		server.logIn();
		//server.doSomething(2);
		
		server.shadowingExample();		
		System.out.println(server.shadowing);
	}
}