class Foo {
    
    int size;
    String name;
    
    // It has no return type and its name must exactly match the class name.
    Foo() { } // default constructor
    
    // Constructors are used to initialize the instance variable state
    Foo(String name, int size) {
        this.name = name;
        this.size = size;
    }
}