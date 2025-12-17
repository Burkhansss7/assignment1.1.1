import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public String getLibraryName() { return libraryName; }
    public void setLibraryName(String libraryName) { this.libraryName = libraryName; }

    public void addBook(book book) {
        books.add(book);
    }

    public void printBooks() {
        System.out.println("Library: " + libraryName);
        for (book b : books) {
            b.printInfo();
        }
    }
}
