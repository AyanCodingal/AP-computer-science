public class Main {
    public static void main(String[] args) {
        // 1. Create a Student object "alice" who is taking:
        //    "Computer Science" with a grade of 3.7 (B+)
        //    "Math" with a grade of 4.0 (A)
        Student alice = new Student("Alice", 1);
        alice.addCourse(new Course("Computer Science", 3.7));
        alice.addCourse(new Course("Math", 4.0));
        alice.computeGPA();  // compute Alice's GPA

        // 2. Create a Student object "bob" who is taking the same courses as Alice
        //    but with different grades:
        //    "Computer Science" with a grade of 3.0
        //    "Math" with a grade of 3.5
        Student bob = new Student("Bob", 2);
        bob.addCourse(new Course("Computer Science", 3.0));
        bob.addCourse(new Course("Math", 3.5));
        bob.computeGPA();  // compute Bob's GPA

        // 3. Print Bob's GPA and transcript
        System.out.println("Bob's GPA: " + bob.getGPA());
        System.out.println(bob.getTranscript());
    }
}
