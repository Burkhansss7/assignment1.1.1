public class Main {
    public static void main(String[] args) {

        LibraryItem item1 = new book("Java Basics", "John Doe", 2023, true);
        LibraryItem item2 = new book("C++ Basics", "Artem Sergey", 2020, false);

        item1.printInfo();
        item2.printInfo();

        System.out.println(item1.equals(item2));
    }
}
