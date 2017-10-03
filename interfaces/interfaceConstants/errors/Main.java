public class Main implements Bar {
	public static void main(String[] args) {
		FOO = 16; //error: cannot assign a value to final variable FOO (compilation error)
		System.out.println(FOO);
	}
}
