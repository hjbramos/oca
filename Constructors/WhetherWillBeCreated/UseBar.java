class Bar {
    void takeInt(int x) { }
}

public class UseBar {
    public static void main (String[] args) {
        Bar b = new Bar();
        b.takeInt(); // Try to invoke a no-arg takeInt() method
        // error: method takeInt in class Bar cannot be applied to given types;
    }
}