
public class Book {
    private String isbn;
    private String title;
    private String author;
    private boolean borrowed;
    private Person borrowedBy;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.borrowed = false;
    }

    public String getTitle() { return title; }
    public boolean isBorrowed() { return borrowed; }
    public Person getBorrowedBy() { return borrowedBy; }

    public boolean borrow(Person person) {
        if (!borrowed) {
            borrowed = true;
            borrowedBy = person;
            return true;
        }
        return false;
    }

    public void returnBook() {
        borrowed = false;
        borrowedBy = null;
    }
}
