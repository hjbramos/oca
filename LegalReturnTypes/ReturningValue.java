class Button {
    
}

class Animal {
    
}

class Horse extends Animal {
    
}

interface Chewable {
    
}

class Gum implements Chewable {
    
}

abstract class Animal2 {
    
}

class Bear extends Animal2 {
    
}

class Foo {
    
    // you can return null in a method with an object reference return type.
    public Button doStuff() {
        return null;
    }
    
    // An array is a perfectly legal return type
    public String[] go() {
        return new String[] {"Fred", "Barney", "Wilma"};
    }
    
    // In a method with a primitive return type, you can return any value or variable that can be implicity coverted to the declared return type.
    public int foo() {
        char c = 'c';
        return c; // char is compatible with int
    }
    
    // In a method with a primitive return type, you can return any value or variable that can be explicitly cast to the declared return type.
    public int boo() {
        float f = 32.5f;
        return (int) f;
    }
    
    // You must not return anything from a method with a void return type.
    //public void bar() {
    //    return "This is it."; // Not legal!! (error: incompatible types: unexpected return value)
    //}
    
    // In a method with an object reference return type, you can return any object type that can be implicitly cast to the declared return type.
    public Animal getAnimal() {
        return new Horse(); // Assume Horse extends Animal
    }
    
    public Object getObject() {
        int[] nums = {1, 2, 3};
        return nums; // return an int array, which is still an object.
    }
    
    // Method with an interface return type
    public Chewable getChewable() {
        return new Gum(); // Return interface implementer
    }
    
    
    //Wathc for methods that declare an abastract class or interface return type, and know that any object that passes the IS-A test (in other words, would test true using the instanceof operator can be returned from that method)
    public Animal2 goAnimal() {
        return new Bear(); // OK, Bear "is-a" Animal
    }
}

public class ReturningValue {
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.foo());
        System.out.println(foo.boo());
    }
}