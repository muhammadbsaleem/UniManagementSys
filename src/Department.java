
import java.util.ArrayList;

public class Department {
    private String name;
    private Budget budget;
    private ArrayList<Faculty> facultyMembers;
    private ArrayList<Course> courseOfferings;

    public Department(String name, double annualBudgetLimit) {
        this.name = name;
        this.budget = new Budget(annualBudgetLimit);
        this.facultyMembers = new ArrayList<Faculty>();
        this.courseOfferings = new ArrayList<Course>();
    }

    public String getName() { return name; }
    public Budget getBudget() { return budget; }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void addCourse(Course course) {
        courseOfferings.add(course);
    }

    public ArrayList<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    public ArrayList<Course> getCourseOfferings() {
        return courseOfferings;
    }
}
