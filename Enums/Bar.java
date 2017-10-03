public class Bar {
    private enum CoffeeSize2 {BIG, HUGE, OVERWHELMING}
    public void doStuff() {
        enum CoffeeSize {BIG, HUGE, OVERWHELMING} // error: enum types must not be local (compilation error)
    }
}