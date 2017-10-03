
// An interface can itself extend another interface
interface Bounceable extends Moveable {
    void bounce();
    void setBounceFactor(int bf);
    static void doStuffStaticaly() {
        System.out.println("doing stuff staticaly");
    }
}

interface Moveable {
    void doMoveableThing();
}

interface Serializable {
    void doSerializableThing();
}

// error: Pen is not abstract and does not override abstract method setBounceFActor(int) in Bounceable
//class Pen implements Bounceable { }

abstract class Ball implements Bounceable {
    
}

class BeachBall extends Ball {
    public void bounce() {
        System.out.println("Implementing bounce method.");
    }
    
    public void setBounceFactor(int bf) {
        System.out.println("Implementing setBounceFactor method");
    }
    
    public void doMoveableThing() {
        System.out.println("Implementing doMouveableThing method.");
    }
}

// A class can implement more than one interface. It's perfectly legal to say:
class SoccerBall extends Ball implements Serializable, Runnable {
    
    // Implement Bounceable's methods
    public void bounce() {
        System.out.println("Implementing bounce method.");
    }
    
    // Implement Bounceable's methods 
    public void setBounceFactor(int bf) {
        System.out.println("Implementing setBounceFactor method");
    }
    
    // Implement Bounceable >> Moveable' methods
    public void doMoveableThing() {
        System.out.println("Implementing doMouveableThing method.");
    }
    
    // Implement Serializable's methods
    public void doSerializableThing() {
        System.out.println("Implementing doSerializableThing method.");
    }
    
    // Implement Runnable's methods
    public void run() {
        System.out.println("Implementing run method.");
    }
}