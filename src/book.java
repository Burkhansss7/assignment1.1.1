public class book {
    private int id;
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    public book(int id, String title, String author, int year, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public book(String title, String author, int year, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = isAvailable;
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
    public boolean isAvailable() { return isAvailable; }

    @Override
    public String toString() {
        return title + " | " + author + " | " + year + " | available=" + isAvailable;
    }
}
