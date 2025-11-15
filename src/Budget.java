
public class Budget {
    private double annualLimit;
    private double spent;

    public Budget(double annualLimit) {
        this.annualLimit = annualLimit;
        this.spent = 0.0;
    }

    public double getAnnualLimit() { return annualLimit; }
    public double getSpent() { return spent; }

    public boolean allocate(double amount) {
        if (spent + amount <= annualLimit) {
            spent += amount;
            return true;
        }
        System.out.println("Budget exceeded!");
        return false;
    }

    public double getRemaining() {
        return annualLimit - spent;
    }
}
