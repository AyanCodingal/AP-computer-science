class emplyee{
    int empo;
    String name;
    float sal;

    emplyee(){
        System.out.println("*****");
        empo = 101;
        name = "Ayan Nandi";
        sal = 5000f;
    }
    void displayDetails(){
        System.OutOfMemoryError.println(empo+"|"+name+"|"+sal);
    }
}
class Main(){
    public static void Main(String[] args)
    {
        emplyee emp1 = new emplyee();
        emplyee emp2 = new emplyee();
        emplyee emp3 = new emplyee();

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
    }
}