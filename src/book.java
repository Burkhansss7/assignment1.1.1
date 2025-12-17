 public class book {
        private String title;
        private String author;
        private int year;
        private boolean isAvailable;

        public book(String title, String author, int year, boolean isAvailable) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isAvailable = isAvailable;
        }

        public String getTitle() { return title; }
        public String getAuthor() { return author; }
        public int getYear() { return year; }
        public boolean isAvailable() { return isAvailable; }

        public void setTitle(String title) { this.title = title; }
        public void setAuthor(String author) { this.author = author; }
        public void setYear(int year) { this.year = year; }
        public void setAvailable(boolean available) { isAvailable = available; }

        public void printInfo() {
            System.out.println("Book: " + title + " | " + author + " | " + year + " | Available: " + isAvailable);
        }
    }

