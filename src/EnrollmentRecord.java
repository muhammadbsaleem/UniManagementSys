
import java.util.ArrayList;

public class EnrollmentRecord {
    private ArrayList<Course> currentCourses;

    public EnrollmentRecord() {
        this.currentCourses = new ArrayList<Course>();
    }

    public void addCourse(Course course) {
        if (!currentCourses.contains(course)) {
            currentCourses.add(course);
        }
    }

    public void removeCourse(Course course) {
        currentCourses.remove(course);
    }

    public ArrayList<Course> getCurrentCourses() {
        return currentCourses;
    }
}
