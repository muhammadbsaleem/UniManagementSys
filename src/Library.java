
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void showBorrowingRules(Person person, int maxBooks, int days) {
        System.out.println(person.getName() + " (" + person.getRole() + ") can borrow up to "
                + maxBooks + " books for " + days + " days.");
    }

    public boolean borrowBook(Person person, Book book) {
        if (book.borrow(person)) {
            System.out.println(person.getName() + " borrowed book: " + book.getTitle());
            return true;
        }
        System.out.println("Book already borrowed.");
        return false;
    }

    public void returnBook(Book book) {
        book.returnBook();
        System.out.println("Book returned: " + book.getTitle());
    }
}
