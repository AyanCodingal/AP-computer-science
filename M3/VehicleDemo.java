public class VehicleDemo {
    public static void main(String[] args) {
        // Although Vehicle is abstract, we can use a Vehicle reference:
        Vehicle car = new Car("Toyota", "Camry", 2020, 4);
        Vehicle truck = new Truck("Ford", "F-150", 2021, 1000);

        // Polymorphic behavior: drive() calls the subclass implementation
        car.drive();    // Output: Driving car...
        truck.drive();  // Output: Driving truck...

        // Access fields via inherited getters
        System.out.println("Car make: " + car.getMake());
        System.out.println("Truck make: " + truck.getMake());

        // Casting to access subclass-specific methods
        if (car instanceof Car) {
            Car realCar = (Car) car;
            System.out.println("Car doors: " + realCar.getNumDoors());
        }

        if (truck instanceof Truck) {
            Truck realTruck = (Truck) truck;
            System.out.println("Truck payload: " + realTruck.getPayloadCapacity());
        }
    }
}
