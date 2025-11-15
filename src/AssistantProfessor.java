
public class AssistantProfessor extends Faculty implements Teachable {

    public AssistantProfessor(String id, String name, String email, String phone,
                              String departmentName, double salary,
                              String officeRoomNumber, String researchArea) {
        super(id, name, email, phone, departmentName, salary, officeRoomNumber, researchArea);
    }

    @Override
    public String getRole() {
        return "Assistant Professor";
    }

    @Override
    public int calculateWorkload() {
        return 18;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Assistant Professor Dashboard for " + getName());
    }

    @Override
    public void teach(Course course) {
        System.out.println(getName() + " is teaching " + course.getCode());
    }

    @Override
    public void assignGrades(Course course) {
        System.out.println(getName() + " is assigning grades for " + course.getCode());
    }

    @Override
    public void holdOfficeHours() {
        System.out.println(getName() + " holds office hours.");
    }
}
