// File: GraduateStudent.java
public class GraduateStudent extends Student {

    public GraduateStudent(String id, String name, String email, String phone,
                           String program, int yearLevel, String cardNumber) {
        super(id, name, email, phone, program, yearLevel, cardNumber);
    }

    @Override
    public String getRole() {
        return "Graduate Student";
    }

    @Override
    protected double getTuitionRatePerCredit() {
        return 1000.0;
    }
}
