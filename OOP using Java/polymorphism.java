// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Superclass reference holding objects of different subclasses
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();
        
        // Calling the makeSound() method on different objects
        animal1.makeSound();  // Output: Some generic animal sound
        animal2.makeSound();  // Output: Woof!
        animal3.makeSound();  // Output: Meow!
    }
}
