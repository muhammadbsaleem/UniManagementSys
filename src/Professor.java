
public class Professor extends Faculty implements Teachable, Researchable {

    public Professor(String id, String name, String email, String phone,
                     String departmentName, double salary,
                     String officeRoomNumber, String researchArea) {
        super(id, name, email, phone, departmentName, salary, officeRoomNumber, researchArea);
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public int calculateWorkload() {
        return 20; // basic example
    }

    @Override
    public void displayDashboard() {
        System.out.println("Professor Dashboard for " + getName()
                + " | Dept: " + getDepartmentName());
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
        System.out.println(getName() + " holds office hours in room "
                + getOffice().getRoomNumber());
    }

    @Override
    public void publishPaper(String title) {
        getResearchProfile().addPublication(title);
        System.out.println(getName() + " published paper: " + title);
    }

    @Override
    public void conductResearch(String topic) {
        System.out.println(getName() + " is researching: " + topic);
    }

    @Override
    public void applyForGrant(String title) {
        System.out.println(getName() + " applied for grant: " + title);
    }
}
