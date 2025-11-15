
public class LabCourse extends Course {

    public LabCourse(String code, String title, int creditHours, int capacity) {
        super(code, title, creditHours, capacity);
    }

    @Override
    public double calculateFinalGrade(Student student) {
        return 88.0;
    }

    @Override
    public boolean checkPrerequisites(Student student) {
        return true; // simple
    }

    @Override
    public void generateSyllabus() {
        getSyllabus().setOutline("Lab course syllabus for " + getCode());
    }
}
