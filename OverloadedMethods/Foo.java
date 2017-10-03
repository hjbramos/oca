public class Foo {
    
    public void changeSize(int size, String name, float pattern) {
        System.out.println("size: " + size + "; " + "name: " + name + "; " + "pattern: " + pattern + ". ");
    }
    
    public String changeSize() {
        return "string";
    }
    
    public void changeSize(String name, int size) {
        System.out.println("name: " + name + "; " + "size: " + size + "; ");    
    }
    
    // error: method changeSize() is already defined in class Foo
    //private void changeSize() {
    //    System.out.println("not overloaded");
    //}
    
    // never reached, because it's private
    private int changeSize(int size, float pattern) {
        return size;
    }
    
    public int changeSize(int size) {
        return size;
    }
    
    public void changeSize(int size, String name) throws Exception {
        throw new Exception("Error!");
    }
    
    public static void main(String[] args) {
        Foo foo = new Foo();
        System.out.println(foo.changeSize());
        foo.changeSize("left", 2);
        foo.changeSize(3, 2f); //  extecute changeSize(String name, int size) method
        System.out.println(foo.changeSize(7));
        
        try {
            foo.changeSize(2, "error");
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
        //  error: no suitable method found for changeSize(int,double)
        //foo.changeSize(3, 2.0);
    }
}