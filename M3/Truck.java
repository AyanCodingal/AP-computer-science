public class Truck extends Vehicle {
    private int payloadCapacity;

    public Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);  // Calls Vehicle constructor
        this.payloadCapacity = payloadCapacity;
    }

    public int getPayloadCapacity() {
        return payloadCapacity;
    }

    // Implementation of the abstract drive() method
    @Override
    public void drive() {
        System.out.println("Driving truck...");
    }
}
