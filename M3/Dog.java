public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    // Override makeSound for a Dog
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
