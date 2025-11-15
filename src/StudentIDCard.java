
public class StudentIDCard {
    private String cardNumber;
    private Student owner;

    public StudentIDCard(Student owner, String cardNumber) {
        this.owner = owner;
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() { return cardNumber; }
    public Student getOwner() { return owner; }
}
