class Frog {
    static int frogCount = 0; // Declare and initialize static variable
    
    static int getCount() {
        return frogCount;
    }
    
    public Frog() {
        frogCount += 1; //modify the value in the constructor
    }
}