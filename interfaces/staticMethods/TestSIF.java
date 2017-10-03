public class TestSIF implements StaticInterface {
	public static void main(String[] args) {
		System.out.println(StaticInterface.m1());

		new TestSIF().go();
		
		// error: cannot find symbol
		//System.out.println(m1()); // illegal: reference to interface is required.
	}

	void go() {
		// also legal from an instance
		System.out.println(StaticInterface.m1()); 
	}
}
