class Animal { }
class Horse extends Animal { }
class Tree { }

public class UseAnimals {
    public void doStuff(Animal a) {
        System.out.println("In the Animal version");
    }
    
    public void doStuff(Horse h) {
        System.out.println("In the Horse version");
    }
    
    public static void main(String[] args) {
        UseAnimals ua = new UseAnimals();
        Animal animal = new Animal();
        Horse horse = new Horse();
        Animal animalRefToHorse = new Horse();
        
        ua.doStuff(animal);
        ua.doStuff(horse);
        ua.doStuff(animalRefToHorse); // In the Animal Version; reference type (not the object type) determines which overloaded method is invoked!
        
        Tree tree = new Tree();
        //ua.doStuff(tree); // error: no suitable method found for doStuff(Tree)
    }
}