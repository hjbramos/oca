class A {
    A() {
        this("foo"); //  error: recursive constructor invocation
    }
    A(String s) {
        this();
    }
}