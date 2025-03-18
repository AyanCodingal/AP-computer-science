public class Course {
    private String courseName;
    private double grade;

    public Course(String courseName, double grade) {
        this.courseName = courseName;
        this.grade = grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getGrade() {
        return grade;
    }

    /**
     * Convert the numeric grade to a letter grade.
     * For example:
     *   >= 3.7 => A
     *   >= 3.0 => B
     *   >= 2.0 => C
     *   >= 1.0 => D
     *   <  1.0 => F
     */
    public String getLetterGrade() {
        if (grade >= 3.7) {
            return "A";
        } else if (grade >= 3.0) {
            return "B";
        } else if (grade >= 2.0) {
            return "C";
        } else if (grade >= 1.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
