public class Student extends Person{
    private String major;

    public Student(String name, int age, String){
        super(name, age);
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
}