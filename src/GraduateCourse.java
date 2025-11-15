
public class GraduateCourse extends Course {

    public GraduateCourse(String code, String title, int creditHours, int capacity) {
        super(code, title, creditHours, capacity);
    }

    @Override
    public double calculateFinalGrade(Student student) {
        return 90.0;
    }

    @Override
    public boolean checkPrerequisites(Student student) {
        // require student to be Graduate or PhD
        return (student instanceof GraduateStudent);
    }

    @Override
    public void generateSyllabus() {
        getSyllabus().setOutline("Graduate course syllabus for " + getCode());
    }
}
