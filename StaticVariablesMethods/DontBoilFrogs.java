public class DontBoilFrogs implements FrogBoilable {
    public static void main(String[] args) {
        new DontBoilFrogs().go();
    }
    
    void go() {
        System.out.println(hop()); // 1 - ok for default method
        // System.out.println(getCtoF(100)); // 2 - cannot find symbol
        
        System.out.println(FrogBoilable.getCtoF(100)); // 3 - of for static method
        DontBoilFrogs dbf = new DontBoilFrogs();
        // System.out.println(dbf.getCtoF(100)); // 4 - cannot find symbol
    }
}