public class Main {
    public static void main(String[] args) {

        BookRepository repo = new BookRepository();
        repo.addBook(new book("Java", "Oracle", 2023, true));
        repo.getAllBooks().forEach(System.out::println);
        repo.updateAvailability(1, false);
        repo.deleteBook(1);
        repo.addBook(new book("Python", "Guido", 2020, true));
    }
}
