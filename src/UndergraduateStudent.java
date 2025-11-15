
public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String id, String name, String email, String phone,
                                String program, int yearLevel, String cardNumber) {
        super(id, name, email, phone, program, yearLevel, cardNumber);
    }

    @Override
    public String getRole() {
        return "Undergraduate Student";
    }

    @Override
    protected double getTuitionRatePerCredit() {
        return 750.0;
    }
}
