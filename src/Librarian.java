
public class Librarian extends Staff {

    public Librarian(String id, String name, String email, String phone,
                     double salary) {
        super(id, name, email, phone, "Librarian", salary);
    }

    @Override
    public String getRole() {
        return "Librarian";
    }

    @Override
    public int calculateWorkload() {
        return 38;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Librarian Dashboard for " + getName());
    }
}
