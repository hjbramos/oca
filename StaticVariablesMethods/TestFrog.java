public class TestFrog {
    public static void main(String[] args) {
        new Frog();
        new Frog();
        new Frog();
        
        System.out.println("from static " + Frog.getCount()); // static context
        
        new Frog();
        new TestFrog().go();
        
        Frog f = new Frog();
        System.out.println("use ref var " + f.getCount()); // use reference var
    }
    
    void go() {
        System.out.println("fron inst "  + Frog.getCount()); // instance context
    }
}