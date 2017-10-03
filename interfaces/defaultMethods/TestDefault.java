interface TestDefault {
	default int m1() {return 1;} // legal
	public default void m2() {;} // legal
	int m3() {;} // Illegal: error: interface abstract methods cannot have body 
	static default void m4() {;} // Illegal: default cannot be marked static
	default void m5(); // Illegal: default must have a method body
	public default abstract int m6() {;} // Illegal: error: illegal combination of modifiers: abstract and default
}
