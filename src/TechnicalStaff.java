
public class TechnicalStaff extends Staff {

    public TechnicalStaff(String id, String name, String email, String phone,
                          double salary) {
        super(id, name, email, phone, "Technical Staff", salary);
    }

    @Override
    public String getRole() {
        return "Technical Staff";
    }

    @Override
    public int calculateWorkload() {
        return 35;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Technical Staff Dashboard for " + getName());
    }
}
