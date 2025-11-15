
import java.util.ArrayList;

public abstract class Student extends Person implements Enrollable, Payable {
    private String program;
    private int yearLevel;
    private Transcript transcript;
    private EnrollmentRecord enrollmentRecord;
    private StudentIDCard idCard;
    private Professor advisor;
    private FinancialAccount account;
    private double gpa;

    protected Student(String id, String name, String email, String phone,
                      String program, int yearLevel, String cardNumber) {
        super(id, name, email, phone);
        this.program = program;
        this.yearLevel = yearLevel;
        this.transcript = new Transcript();
        this.enrollmentRecord = new EnrollmentRecord();
        this.idCard = new StudentIDCard(this, cardNumber);
        this.account = new FinancialAccount();
        this.gpa = 0.0;
    }

    public String getProgram() { return program; }
    public int getYearLevel() { return yearLevel; }
    public StudentIDCard getIdCard() { return idCard; }

    public Professor getAdvisor() { return advisor; }
    public void setAdvisor(Professor advisor) { this.advisor = advisor; }

    public double getGpa() { return gpa; }

    public void updateGrade(Course course, String grade) {
        transcript.addCourseResult(course, grade);
        recalculateGpa();
    }

    private void recalculateGpa() {
        this.gpa = transcript.calculateGpa();
    }

    public EnrollmentRecord getEnrollmentRecord() { return enrollmentRecord; }
    public FinancialAccount getAccount() { return account; }

    @Override
    public boolean enrollInCourse(Course course) {
        boolean enrolled = course.enrollStudent(this);
        if (enrolled) {
            enrollmentRecord.addCourse(course);
        }
        return enrolled;
    }

    @Override
    public boolean dropCourse(Course course) {
        boolean dropped = course.dropStudent(this);
        if (dropped) {
            enrollmentRecord.removeCourse(course);
        }
        return dropped;
    }

    @Override
    public void viewSchedule() {
        System.out.println("Schedule for " + getName() + ":");
        ArrayList<Course> list = enrollmentRecord.getCurrentCourses();
        for (Course c : list) {
            System.out.println(" - " + c.getCode() + " " + c.getTitle());
        }
    }

    @Override
    public void register() {
        System.out.println("Registering student: " + getName());
    }

    @Override
    public boolean login(String enteredId, String password) {
        // Simple: just match ID
        return getId().equals(enteredId);
    }

    @Override
    public String getPermissions() {
        return "Student portal, enrollment, library access.";
    }

    protected abstract double getTuitionRatePerCredit();

    @Override
    public double calculateFees() {
        int totalCredits = 0;
        ArrayList<Course> list = enrollmentRecord.getCurrentCourses();
        for (Course c : list) {
            totalCredits += c.getCreditHours();
        }
        return totalCredits * getTuitionRatePerCredit();
    }

    @Override
    public double calculateSalary() {
        return 0.0; // students do not earn salary
    }

    @Override
    public int calculateWorkload() {
        int totalCredits = 0;
        ArrayList<Course> list = enrollmentRecord.getCurrentCourses();
        for (Course c : list) {
            totalCredits += c.getCreditHours();
        }
        return totalCredits * 3; // 3 hours per credit
    }

    @Override
    public void processPayment(double amount) {
        account.addPayment(amount, "Tuition payment");
    }

    @Override
    public String generateInvoice() {
        double totalFees = calculateFees();
        return "Invoice for " + getName() + ": tuition due = " + totalFees;
    }

    @Override
    public String getFinancialSummary() {
        return "Student balance: " + account.getBalance();
    }

    @Override
    public void accessLibrary(Library library) {
        library.showBorrowingRules(this, 5, 14);
    }

    @Override
    public void displayDashboard() {
        System.out.println("Student Dashboard for " + getName()
                + " | Program: " + program
                + " | GPA: " + gpa);
    }
}
