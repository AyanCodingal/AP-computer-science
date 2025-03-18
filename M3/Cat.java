public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    // Optionally provide a getter for isIndoor
    public boolean isIndoor() {
        return isIndoor;
    }

    // Override makeSound for a Cat
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
