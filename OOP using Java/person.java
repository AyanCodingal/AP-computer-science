class Person {
    // Private variable - cannot be accessed directly from outside this class
    private String name;

    // Setter method to set the private variable
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to return the value of the private variable
    public String getName() {
        return this.name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();
        
        // Set the private variable using the setter method
        person.setName("Alice");
        
        // Get the private variable's value using the getter method and display it
        System.out.println("Person's name: " + person.getName());
    }
}
