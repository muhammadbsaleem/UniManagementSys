
public abstract class Staff extends Person implements Payable {
    private String position;
    private double salary;
    private FinancialAccount account;

    protected Staff(String id, String name, String email, String phone,
                    String position, double salary) {
        super(id, name, email, phone);
        this.position = position;
        this.salary = salary;
        this.account = new FinancialAccount();
    }

    public String getPosition() { return position; }
    protected double getSalary() { return salary; }
    protected void setSalary(double salary) { this.salary = salary; }

    @Override
    public void register() {
        System.out.println("Registering staff: " + getName());
    }

    @Override
    public boolean login(String enteredId, String password) {
        return getId().equals(enteredId);
    }

    @Override
    public String getPermissions() {
        return "Staff tools and internal systems.";
    }

    @Override
    public double calculateFees() {
        return 0.0;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void processPayment(double amount) {
        account.addPayment(amount, "Staff salary payment");
    }

    @Override
    public String generateInvoice() {
        return "Staff salary slip for " + getName() + ": " + salary;
    }

    @Override
    public String getFinancialSummary() {
        return "Staff account balance: " + account.getBalance();
    }

    @Override
    public void accessLibrary(Library library) {
        library.showBorrowingRules(this, 3, 14);
    }
}
