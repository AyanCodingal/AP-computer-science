public abstract class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // You could also include getters for model and year if desired
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Abstract method that must be overridden by subclasses
    public abstract void drive();
}
