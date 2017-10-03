public class Main {
	
	static int age = 31;
	//static int e# = 10; // error: illegal character (compilation error)
	//static int 7g = 10; //error: <identifier> expected (compilation error)
	
	public static void m1() {
		int x = 31; // method local variable
		
		if(x >= 10) {
			System.out.println("The variable x is greater than 10.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello, world!");
		//System.out.println(x); //  error: cannot find symbol (compilation error)
		System.out.println("I have " + age + " years old.");
		Main.m1();
	}
}