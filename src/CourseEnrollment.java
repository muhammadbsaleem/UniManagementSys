
public class CourseEnrollment {
    private Course course;
    private String grade;
    private int creditHours;

    public CourseEnrollment(Course course, String grade, int creditHours) {
        this.course = course;
        this.grade = grade;
        this.creditHours = creditHours;
    }

    public Course getCourse() { return course; }
    public String getGrade() { return grade; }
    public int getCreditHours() { return creditHours; }
}
