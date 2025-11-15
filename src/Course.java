
import java.util.ArrayList;

public abstract class Course {
    private String code;
    private String title;
    private int creditHours;
    private int capacity;
    private Syllabus syllabus;           // composition
    private Professor instructor;        // aggregation
    private Classroom classroom;
    private Lab lab;
    private ArrayList<Student> enrolledStudents; // many-to-many with Student

    protected Course(String code, String title, int creditHours, int capacity) {
        this.code = code;
        this.title = title;
        this.creditHours = creditHours;
        this.capacity = capacity;
        this.syllabus = new Syllabus();
        this.enrolledStudents = new ArrayList<Student>();
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCreditHours() { return creditHours; }
    public int getCapacity() { return capacity; }

    public Professor getInstructor() { return instructor; }
    public void setInstructor(Professor instructor) { this.instructor = instructor; }

    public Classroom getClassroom() { return classroom; }
    public void setClassroom(Classroom classroom) { this.classroom = classroom; }

    public Lab getLab() { return lab; }
    public void setLab(Lab lab) { this.lab = lab; }

    public Syllabus getSyllabus() { return syllabus; }

    public ArrayList<Student> getEnrolledStudents() { return enrolledStudents; }

    protected boolean hasSpace() {
        return enrolledStudents.size() < capacity;
    }

    public boolean enrollStudent(Student student) {
        if (!hasSpace()) {
            System.out.println("Course " + code + " is full.");
            return false;
        }
        if (!checkPrerequisites(student)) {
            System.out.println("Student does not meet prerequisites for " + code);
            return false;
        }
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    public boolean dropStudent(Student student) {
        return enrolledStudents.remove(student);
    }

    // Abstract methods
    public abstract double calculateFinalGrade(Student student);
    public abstract boolean checkPrerequisites(Student student);
    public abstract void generateSyllabus();
}
