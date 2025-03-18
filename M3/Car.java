public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);  // Calls Vehicle constructor
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    // Implementation of the abstract drive() method
    @Override
    public void drive() {
        System.out.println("Driving car...");
    }
}
