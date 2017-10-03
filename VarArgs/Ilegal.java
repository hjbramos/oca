public class Illegal {
	void doStuff4(int x...)  { } //bad syntax 
	void doStuff5(int... x, char... y) { } // to many var-args
	void doStuff6(String... a, byte b) { } //  var-arg must be last
}