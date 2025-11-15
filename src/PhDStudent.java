
public class PhDStudent extends GraduateStudent implements Researchable {

    public PhDStudent(String id, String name, String email, String phone,
                      String program, int yearLevel, String cardNumber) {
        super(id, name, email, phone, program, yearLevel, cardNumber);
    }

    @Override
    public String getRole() {
        return "PhD Student";
    }

    @Override
    public void accessLibrary(Library library) {
        // Extended borrowing rules
        library.showBorrowingRules(this, 20, 60);
    }

    @Override
    public void publishPaper(String title) {
        System.out.println(getName() + " (PhD) published paper: " + title);
    }

    @Override
    public void conductResearch(String topic) {
        System.out.println(getName() + " is doing PhD research on " + topic);
    }

    @Override
    public void applyForGrant(String title) {
        System.out.println(getName() + " applied for research grant: " + title);
    }
}
