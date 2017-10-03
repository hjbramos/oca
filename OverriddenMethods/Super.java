public class Super {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printYourself();
        
        System.out.println(" ");
        
        Animal animal2 = new Horse();
        animal2.printYourself();
        
        System.out.println(" ");
        
        Horse horse = new Horse();
        horse.printYourself();
    }
}

class Animal {
    public void eat() { }
    public void printYourself() {
        System.out.println("printYourself Animal method");
    }
}

class Horse extends Animal {
    public void printYourself() {
        super.printYourself();
        System.out.println("printYourself Horse method");
    }
}