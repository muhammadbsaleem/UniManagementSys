
import java.util.ArrayList;

public class Transcript {
    private ArrayList<CourseEnrollment> courseEnrollments;

    public Transcript() {
        this.courseEnrollments = new ArrayList<CourseEnrollment>();
    }

    public void addCourseResult(Course course, String grade) {
        courseEnrollments.add(new CourseEnrollment(course, grade, course.getCreditHours()));
    }

    public double calculateGpa() {
        double totalPoints = 0.0;
        int totalCredits = 0;

        for (CourseEnrollment ce : courseEnrollments) {
            totalCredits += ce.getCreditHours();
            totalPoints += ce.getCreditHours() * gradeToPoints(ce.getGrade());
        }

        if (totalCredits == 0) return 0.0;
        return totalPoints / totalCredits;
    }

    private double gradeToPoints(String grade) {
        if (grade == null) return 0.0;
        grade = grade.toUpperCase();
        if (grade.equals("A")) return 4.0;
        if (grade.equals("B")) return 3.0;
        if (grade.equals("C")) return 2.0;
        if (grade.equals("D")) return 1.0;
        return 0.0;
    }
}
