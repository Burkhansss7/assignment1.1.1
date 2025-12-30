import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    // Добавление элемента в библиотеку
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Вывод всех элементов
    public void printAllItems() {
        for (LibraryItem item : items) {
            item.printInfo(); // полиморфизм
        }
    }

    // Поиск по названию
    public LibraryItem findByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    // Фильтрация по году
    public List<LibraryItem> filterByYear(int year) {
        List<LibraryItem> result = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.getYear() == year) {
                result.add(item);
            }
        }
        return result;
    }

    // Сортировка по году
    public void sortByYear() {
        items.sort(Comparator.comparingInt(LibraryItem::getYear));
    }
}
