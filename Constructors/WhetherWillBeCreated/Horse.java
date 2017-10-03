class Animal {
    Animal(String name) { }
}

class Horse extends Animal {
    Horse() {
        super(); // Problem.
    }
}

/*
If your super constructor has arguments, you must type in the call to super(), supplying the appropriate arguments.
*/