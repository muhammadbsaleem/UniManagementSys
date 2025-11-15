
public class Lecturer extends Faculty implements Teachable {

    public Lecturer(String id, String name, String email, String phone,
                    String departmentName, double salary,
                    String officeRoomNumber) {
        super(id, name, email, phone, departmentName, salary, officeRoomNumber, "Teaching");
    }

    @Override
    public String getRole() {
        return "Lecturer";
    }

    @Override
    public int calculateWorkload() {
        return 15;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Lecturer Dashboard for " + getName());
    }

    @Override
    public void teach(Course course) {
        System.out.println(getName() + " is giving a lecture in " + course.getCode());
    }

    @Override
    public void assignGrades(Course course) {
        System.out.println(getName() + " is grading " + course.getCode());
    }

    @Override
    public void holdOfficeHours() {
        System.out.println(getName() + " is available for student questions.");
    }
}
