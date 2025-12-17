public class Main {
    public static void main(String[] args) {

        book b1 = new book("Harry Potter", "J.K. Rowling", 1997, true);
        book b2 = new book("The Hobbit", "J.R.R. Tolkien", 1937, false);

        LibraryUser u1 = new LibraryUser("Alice", 1);
        LibraryUser u2 = new LibraryUser("Bob", 2);

        Library library = new Library("City Library");
        library.addBook(b1);
        library.addBook(b2);

        b1.printInfo();
        b2.printInfo();
        u1.printInfo();
        u2.printInfo();
        library.printBooks();

        System.out.println("Are books equal? " + (b1.getTitle().equals(b2.getTitle())));
    }
}
