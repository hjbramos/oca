public class Boar {
    Boar() { } // constructor
    void doStuff() {
       // Boar(); // calling the constructor - illegal! error: cannot find symbol
    }
}

/* the only way a constructor can be invoked is from within anoteher constructor. In other words, you can't write code that actually calls a constructor.
*/