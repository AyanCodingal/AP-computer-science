import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;
    private double gpa;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
        this.gpa = 0.0;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     * Computes the GPA by averaging the numeric grades of all courses.
     */
    public void computeGPA() {
        if (courses.isEmpty()) {
            gpa = 0.0;
            return;
        }
        double sum = 0.0;
        for (Course c : courses) {
            sum += c.getGrade();
        }
        gpa = sum / courses.size();
    }

    public double getGPA() {
        return gpa;
    }

    /**
     * Returns a string representing the student's transcript.
     * It lists each course, its numeric grade, and letter grade,
     * and ends with the student's overall GPA.
     */
    public String getTranscript() {
        StringBuilder sb = new StringBuilder();
        sb.append("Transcript for ").append(name)
          .append(" (ID: ").append(id).append(")\n");
        for (Course c : courses) {
            sb.append("Course: ").append(c.getCourseName())
              .append(" - Numeric Grade: ").append(c.getGrade())
              .append(" (").append(c.getLetterGrade()).append(")\n");
        }
        sb.append("Overall GPA: ").append(getGPA());
        return sb.toString();
    }
}
