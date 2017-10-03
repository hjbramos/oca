class Foo {
    void go() {
        
    }
}

class Bar extends Foo {
    String go(int x) { // That's perfectly fine. A different return type. As long as you've changed the argument list, you're overloading the method.
        return null;
    }
}

class Bar2 extends Foo {
    String go() {  // Not legal! Can't change only the return type
        return null;
    }
}