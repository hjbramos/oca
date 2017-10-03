public class Legal {
	void doStuff(int... x) { } // expects from 0 to many ints as parameters
	void doStuff2(char c, int... x) { } // expects first a char, then 0 to many ints
	void doStuff3(Animal... animal) { } // 0 to many Animals
}