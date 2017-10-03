package exam.stuff;
import cert.Beverage; //error: Beverage is not public in cert; cannot be accessed from outside package (compilation error)

//execute this command: javac DefaultAccess\cert\*java DefaultAccess\exam\stuff\Tea.java

// to fix this, you could put both classes in the same package, or you could declare Beverage as public.

class Tea extends Beverage {

}
