// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass that overrides the makeSound method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another subclass that overrides the makeSound method
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound();  // Output: Animal makes a sound

        Animal dog = new Dog();
        dog.makeSound();  // Output: Dog barks

        Animal cat = new Cat();
        cat.makeSound();  // Output: Cat meows
    }
}
