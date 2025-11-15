
public abstract class Person {
    private String id;
    private String name;
    private String email;
    private String phone;

    protected Person(String id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Encapsulation: private fields, only getters / limited setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) { this.email = email; }
    public String getEmail() { return email; }

    public void setPhone(String phone) { this.phone = phone; }
    public String getPhone() { return phone; }

    // Abstract behaviour that subclasses must implement
    public abstract String getRole();
    public abstract void register();
    public abstract boolean login(String enteredId, String password);
    public abstract String getPermissions();
    public abstract double calculateFees();    // mainly for students
    public abstract double calculateSalary();  // mainly for faculty/staff
    public abstract int calculateWorkload();
    public abstract void displayDashboard();
    public abstract void accessLibrary(Library library);
}
