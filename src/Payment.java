
public class Payment {
    private double amount;
    private String description;

    public Payment(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public double getAmount() { return amount; }
    public String getDescription() { return description; }
}
