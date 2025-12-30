public abstract class LibraryItem {
    protected String title;
    protected int year;
    public LibraryItem(String title, int year) {
        this.title = title;
        this.year = year;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public abstract void printInfo();
}

