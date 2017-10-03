interface StaticIface {
	static int m1() { return 42; } // legal
	public static void m2() { ; } // legal
	final static void m3() { ; } // error: modifier final not allowed here (compilation error)
	
	// error: interface abstract methods cannot have body
	// error: illegal combination of modifiers: abstract and static
	abstract static void m4() { ; } 
	
	//error: missing method body, or declare abstract
	static void m5();

}
