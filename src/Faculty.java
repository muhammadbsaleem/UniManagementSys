
public abstract class Faculty extends Person implements Payable {
    private String departmentName;
    private double salary;
    private FinancialAccount account;
    private OfficeRoom office;
    private ResearchProfile researchProfile;

    protected Faculty(String id, String name, String email, String phone,
                      String departmentName, double salary,
                      String officeRoomNumber, String researchArea) {
        super(id, name, email, phone);
        this.departmentName = departmentName;
        this.salary = salary;
        this.account = new FinancialAccount();
        this.office = new OfficeRoom(officeRoomNumber);
        this.researchProfile = new ResearchProfile(researchArea);
    }

    public String getDepartmentName() { return departmentName; }
    public double getSalary() { return salary; }

    // Protected so only HR-like logic can change
    protected void setSalary(double salary) { this.salary = salary; }

    public OfficeRoom getOffice() { return office; }
    public ResearchProfile getResearchProfile() { return researchProfile; }

    @Override
    public void register() {
        System.out.println("Registering faculty: " + getName());
    }

    @Override
    public boolean login(String enteredId, String password) {
        return getId().equals(enteredId);
    }

    @Override
    public String getPermissions() {
        return "Faculty portal, grading tools, research tools.";
    }

    @Override
    public double calculateFees() {
        return 0.0; // faculty do not pay fees
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public void processPayment(double amount) {
        account.addPayment(amount, "Salary payment");
    }

    @Override
    public String generateInvoice() {
        return "Salary slip for " + getName() + ": " + salary;
    }

    @Override
    public String getFinancialSummary() {
        return "Faculty account balance: " + account.getBalance();
    }

    @Override
    public void accessLibrary(Library library) {
        library.showBorrowingRules(this, 20, 30);
    }
}
