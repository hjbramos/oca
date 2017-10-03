class Clothing {
    Clothing(String s) { }
}

//  error: constructor Clothing in class Clothing cannot be applied to given types;

public class TShirt extends Clothing {
}

/*
if your superclass does not have a no-arg constructor, then in your subclass you will not be able to use the default constructor supplied by the compiler. It's that simple. Because the compiler  can only put in a call to a no-arg super(), you won't even be able to compile something.
*/