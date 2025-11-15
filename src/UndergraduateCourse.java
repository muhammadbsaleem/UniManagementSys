
public class UndergraduateCourse extends Course {

    public UndergraduateCourse(String code, String title, int creditHours, int capacity) {
        super(code, title, creditHours, capacity);
    }

    @Override
    public double calculateFinalGrade(Student student) {
        return 85.0; // dummy value
    }

    @Override
    public boolean checkPrerequisites(Student student) {
        // no prereqs in this simple example
        return true;
    }

    @Override
    public void generateSyllabus() {
        getSyllabus().setOutline("Undergraduate course syllabus for " + getCode());
    }
}
