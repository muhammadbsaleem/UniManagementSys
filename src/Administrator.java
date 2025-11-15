
public class Administrator extends Staff {

    public Administrator(String id, String name, String email, String phone,
                         double salary) {
        super(id, name, email, phone, "Administrator", salary);
    }

    @Override
    public String getRole() {
        return "Administrator";
    }

    @Override
    public int calculateWorkload() {
        return 40;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Admin Dashboard for " + getName());
    }
}
