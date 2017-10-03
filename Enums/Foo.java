enum CoffeeSize3 {BIG, HUGE, OVERWHELMING}

public class Foo {
    enum CoffeeSize {BIG, HUGE, OVERWHELMING}
    enum CoffeeSize2 {big, HuGe, OverWhelming };
    
    public static void main(String[] args) {
        System.out.println(CoffeeSize.BIG);
        CoffeeSize cs = CoffeeSize.HUGE;
        System.out.println(cs);
    }
}