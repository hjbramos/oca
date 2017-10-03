public class Box {
    // hide the instance variable; only an instance
    // of Box can access it
    private int size;
    // provide public getters and setters
    public int getSize() {
        return size;
    }
    public void setSize(int newSize) {
        size = newSize;
    }
}