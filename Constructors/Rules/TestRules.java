public class TestRules {
    public static void main(String[] args) {
        Animal animal = Animal.getInstance();
        animal.makeNoise();
        
        Dog dog = new Dog("Thor");
        System.out.println(dog.getName());
        
        Shinauzer calvin = new Shinauzer("Calvin");
        System.out.println(calvin.getName());
        
        Gold gold = new Gold();
        
        Ravine ravine = new Ravine("Rabina");
        
    }
}