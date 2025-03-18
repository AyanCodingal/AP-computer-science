public class Main{
    public static void main(String[] args) {
        Student student= new Student('John', 25. "Computer SCience");
        Book book = new Book("The Habbit"," J J Rowlin", 1256);

        System.out.println("Student Information");
        System.out.println("Name"+ student.getName());
        System.out.println("Age"+ student.getAge());
        System.out.println("Major"+ student.getMajor());

        System.out.println("Book Information");
        System.out.println("Book name"+ student.getTitle());
        System.out.println("Author"+ student.getAuthor());
        System.out.println("Pages"+ student.getNumPages());
    }
}