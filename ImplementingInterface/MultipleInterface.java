
//  All abstract, default, and static methods in an interface are implicitly public, so you can omit the public modifier.
// All constant values defined in an interface are implicitly public, static, and final.  

interface I1 { // default modifier
    default int doStuff() { // concrete method.
        return 1;
    }
}

interface I2 {
    default int doSutff() { // concrete method.
        return 2;
    }
}

public class MultipleInterface implements I1, I2 {
    public static void main(String[] args) {
        new MultipleInterface().go();
    }
    
    void go() {
        System.out.println(doStuff()); // 1 - if it isn't override / 3 if it is override
    }
    
    public int doStuff() {
        return 3;
    }
}