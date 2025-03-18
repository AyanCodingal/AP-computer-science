public class AnimalTest {
    public static void main(String[] args) {
        // Create instances of Animal, Dog, and Cat
        Animal genericAnimal = new Animal("Generic Animal", 5);
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        Cat myCat = new Cat("Kitty", 2, true);

        // Call their methods
        System.out.println("=== Direct Instances ===");
        genericAnimal.makeSound();  // The animal makes a sound
        myDog.makeSound();          // The dog barks
        myCat.makeSound();          // The cat meows

        // Demonstrate inheritance (accessing parent methods)
        System.out.println("\n--- Checking inherited methods ---");
        System.out.println("Dog's name: " + myDog.getName());
        System.out.println("Cat's age: " + myCat.getAge());

        // Show polymorphism by referencing Dog and Cat objects with Animal type
        Animal polyDog = new Dog("Max", 4, "Bulldog");
        Animal polyCat = new Cat("Whiskers", 1, false);

        System.out.println("\n=== Polymorphism Examples ===");
        polyDog.makeSound();  // The dog barks
        polyCat.makeSound();  // The cat meows

        // Casting back to access subclass-specific methods (optional demonstration)
        if (polyDog instanceof Dog) {
            Dog realDog = (Dog) polyDog;
            System.out.println("PolyDog breed: " + realDog.getBreed());
        }

        if (polyCat instanceof Cat) {
            Cat realCat = (Cat) polyCat;
            System.out.println("Is Whiskers indoor? " + realCat.isIndoor());
        }
    }
}
