public class TestAnimal {
    public static void main(String [] args) {
        Animal a = new Dog();
        //a.eat(); //error: unreported exception Exception; must be caught or declared to be thrown
        
        Dog d = new Dog();
        d.eat();
    }
}

class Animal {
    public void eat() throws Exception {
        throw new Exception();
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Dog is eating...");
    }
}