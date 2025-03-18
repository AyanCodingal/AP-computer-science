public class MethodOverloadingDemo {
    // Overloaded method: adds two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Overloaded method: adds three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Overloaded method: adds two double values
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MethodOverloadingDemo demo = new MethodOverloadingDemo();
        
        // Calling the method that adds two integers
        System.out.println("Sum of two ints: " + demo.add(10, 20));
        
        // Calling the method that adds three integers
        System.out.println("Sum of three ints: " + demo.add(10, 20, 30));
        
        // Calling the method that adds two doubles
        System.out.println("Sum of two doubles: " + demo.add(10.5, 20.5));
    }
}
