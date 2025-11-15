
import java.util.ArrayList;

public class FinancialAccount {
    private double balance; // positive = overpaid, negative = owing
    private ArrayList<Payment> history;

    public FinancialAccount() {
        this.balance = 0.0;
        this.history = new ArrayList<Payment>();
    }

    public void addPayment(double amount, String description) {
        balance += amount;
        history.add(new Payment(amount, description));
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Payment> getHistory() {
        return history;
    }
}
